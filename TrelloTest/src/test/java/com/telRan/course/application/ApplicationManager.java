package com.telRan.course.application;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager{
    WebDriver wd;
    private BoardHelper boardHelper;
    private ListHelper listHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private String browser;
   // Properties properties;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() throws IOException {
//        String target = properties.getProperty("target", "local");
//        properties.load(new FileReader(String.format("C:src/test/resources/%s.properties", target)));
        if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        }else if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }else if (browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }else if (browser.equals(BrowserType.EDGE)){
            wd = new EdgeDriver();
        }

//        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        boardHelper = new BoardHelper(wd);
        listHelper = new ListHelper(wd );
        sessionHelper = new SessionHelper(wd);
        navigationHelper = new NavigationHelper(wd);

        openSite("https://trello.com/");
        sessionHelper.login("dkuzinets@gmail.com", "TelRan17");
    }

    public void stop() {
        sessionHelper.logout();
        wd.quit();
    }

    public void openSite(String url) {
        wd.get(url);
    }


    public BoardHelper getBoardHelper() {
        return boardHelper;
    }

    public ListHelper getListHelper() {
        return listHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
