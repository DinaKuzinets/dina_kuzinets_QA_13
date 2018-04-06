package com.telRan.course.tests;

import com.telRan.course.model.ProfileData;
import org.testng.annotations.Test;

import java.io.File;


public class AvatarChangeTest extends TestBase {

    @Test
    public void testAvatarChange() {
        File photo = new File("src/test/resources/vat.jpg");
        app.getProfileHelper().clickAvatarButton();
        app.getProfileHelper().clickSettingsButton();
        app.getProfileHelper().clickChangeAvatarButton();
        //app.getProfileHelper().clickUploadButton();
        app.getProfileHelper().attachNewPhoto(new ProfileData().withPhoto(photo));


    }
}
