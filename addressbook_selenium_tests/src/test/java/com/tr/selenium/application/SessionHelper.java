package com.tr.selenium.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {



    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void logIn(String user, String pwd) {
        type(By.name("user"),user);
        type(By.name("pass"),pwd);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }


    public void logOut() {
        click(By.cssSelector("a[onclick='document.logout.submit();']"));
    }

}
