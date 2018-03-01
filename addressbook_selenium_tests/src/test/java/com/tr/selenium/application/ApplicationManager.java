package com.tr.selenium.application;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;
    private SessionHelper sessionHelper;
        private GroupeHelper groupeHelper;
        private NavigationHelper navigationHelper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void start() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(wd);
        groupeHelper = new GroupeHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        openSite();
        sessionHelper.logIn();
    }



    public void openSite() {
        wd.get("http://localhost/addressbook/");
    }

    public void stop() {
        //logOut();
        // wd.quit();
    }

    private void logOut() {
        wd.findElement(By.cssSelector("a[onclick='document.logout.submit();']")).click();
    }

    public void goToAddNewContactePage() {
        wd.findElement(By.cssSelector("a[href='edit.php']")).click();
    }

    public void fillContactForm(ContactData contactData) {
        wd.findElementByName("firstname").click();
        wd.findElementByName("firstname").clear();
        wd.findElementByName("firstname").sendKeys(contactData.getFitstName());
        wd.findElementByName("lastname").click();
        wd.findElementByName("lastname").clear();
        wd.findElementByName("lastname").sendKeys(contactData.getLastName());
    }

    public void cliclEnterContactButton() {
        wd.findElementByName("submit").click();
    }

    public void returnToContactHomePage() {
        wd.findElement(By.cssSelector("a[href='./']")).click();
    }

    public void clickContactEditButton() {
        //  wd.findElementByCssSelector("a[href='edit.php?id=4']").click();
        wd.findElementByCssSelector("img[title='EDIT']").click();
    }

    public void fillContactEditForm(ContactData contactData) {
        wd.findElementByName("firstname").click();
        wd.findElementByName("firstname").clear();
        wd.findElementByName("firstname").sendKeys(contactData.getFitstName());
        wd.findElementByName("lastname").click();
        wd.findElementByName("lastname").clear();
        wd.findElementByName("lastname").sendKeys(contactData.getLastName());

    }

    public void clickUpdateContactButton() {
        wd.findElementByName("update").click();
    }

    public void checkBoxContact() {
        wd.findElementByName("selected[]").click();
    }

    public void Contact() {
        wd.findElementByCssSelector("input[value='DELETE']").click();
    }

    public void submitContactDel() {
        wd.switchTo().alert().accept();
    }

    public GroupeHelper getGroupeHelper() {
        return groupeHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
