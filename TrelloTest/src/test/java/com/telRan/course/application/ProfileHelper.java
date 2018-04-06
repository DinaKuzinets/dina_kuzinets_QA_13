package com.telRan.course.application;

import com.telRan.course.model.BoardData;
import com.telRan.course.model.ProfileData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class ProfileHelper extends HelperBase {

    public ProfileHelper(WebDriver wd) {
        super(wd);
    }


    public void clickAvatarButton(){
        click(By.cssSelector("img.member-avatar"));
    }

    public void clickSettingsButton(){
        click(By.cssSelector("a.js-account"));
    }

    public void clickChangeAvatarButton(){
        click(By.cssSelector("a.big-link.js-change-avatar"));
    }


    public void  attachNewPhoto(ProfileData profileData) {
        attach(By.cssSelector("form.realfile"), profileData.getPhoto());

    }


    public void clickUploadButton() {
        click(By.cssSelector("form.realfile"));
    }
}
