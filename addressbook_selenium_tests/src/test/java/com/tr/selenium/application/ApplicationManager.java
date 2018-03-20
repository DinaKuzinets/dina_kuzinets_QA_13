package com.tr.selenium.application;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private ContactHelper contactHelper;
    private String browser;
    Properties properties;

    public ApplicationManager(String browser) {
        this.browser = browser;
        properties = new Properties();
    }


    public void start() throws IOException {
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(String.format("src/test/resources/%s.properties", target)));
        if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        } else if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }

        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openSite(properties.getProperty("web.baseUrl"));
        sessionHelper = new SessionHelper(wd);
        sessionHelper.logIn(properties.getProperty("web.adminLogin"),properties.getProperty("web.adminPwd"));
        navigationHelper = new NavigationHelper(wd);
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
    }

    public void getBrowserLog(){
        System.out.println(wd.manage().logs().getAvailableLogTypes());
        wd.manage().logs().get("browser").forEach(l -> System.out.println(l));
    }


    public void openSite(String url) {
                wd.get(url);

    }

    public void stop() {
        sessionHelper.logOut();
        wd.quit();
    }


    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
