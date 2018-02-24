package com.tr.selenium.application;

import com.tr.selenium.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

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
        openSite();
        logIn("admin", "secret");
    }

    public void returnToGroupsPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void keepGroupForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void goToGroupsPage() {
        wd.findElement(By.linkText("GROUPS")).click();
    }

    public void logIn(String user, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(user);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
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

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void initGroupDeletion() {
        wd.findElement(By.name("delete")).click();
    }

    public void goToAddNewPage() {
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

    public void cliclEnterButton() {
        wd.findElementByName("submit").click();
    }

    public void returnToHomePage() {
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

    public void clickUpdateButton() {
        wd.findElementByName("update").click();
    }

    public void checkBoxContact() {
    wd.findElementByName("selected[]").click();
    }

    public void clickDelButton() {
        wd.findElementByCssSelector("input[value='DELETE']").click();
    }

    public void submitContactDel() {
        wd.switchTo().alert().accept();
    }
}
