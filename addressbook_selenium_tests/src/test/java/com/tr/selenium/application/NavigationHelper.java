package com.tr.selenium.application;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }




    public void goToContactHomePage() {
        if(isElementPresent(By.id("maintable"))){
            return;
        }
        click(By.cssSelector("a[href='./']"));
    }


    public void goToGroupsPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("GROUPS"));
    }
}
