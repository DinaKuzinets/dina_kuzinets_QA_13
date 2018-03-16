package com.telRan.course.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }


    public void returnToHomepage() {
        click(By.cssSelector("span.header-btn-icon.icon-lg.icon-board-back-to-home.light"));
    }

}
