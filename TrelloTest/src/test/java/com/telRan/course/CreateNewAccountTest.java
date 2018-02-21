package com.telRan.course;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateNewAccountTest extends TestBaseNegative {

    private String perName = "Dina";
    private String email = "dkuzinets@mail.ru";
    private String pwd = "12345678";


    @Test
    public void NewAccount() {
        clickSighUpButton();
        fillPersonName(perName);
        enterEmail(email);
        enterPassword(pwd);
        comfirmSignUpButton();
    }

    private void clickSighUpButton() {
        wd.findElement(By.linkText("Sign Up")).click();
    }


    private void fillPersonName(String perName) {
        wd.findElement(By.id("name")).click();
        wd.findElement(By.id("name")).clear();
        wd.findElement(By.id("name")).sendKeys(perName);
    }

    private void enterEmail(String email) {
        wd.findElement(By.id("email")).click();
        wd.findElement(By.id("email")).clear();
        wd.findElement(By.id("email")).sendKeys(email);
    }

    private void comfirmSignUpButton() {
        wd.findElement(By.id("signup")).click();
    }


}
