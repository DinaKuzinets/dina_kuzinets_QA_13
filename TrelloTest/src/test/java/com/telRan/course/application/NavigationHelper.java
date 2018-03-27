package com.telRan.course.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }


    public void goToHomepage() {
        click(By.cssSelector("span.header-btn-icon.icon-lg.icon-board-back-to-home.light"));
    }

}
