package com.tr.selenium.application;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void clickEnterContactButton() {
        click(By.name("submit"));
    }


    public void clickContactEditButton() {
        click(By.cssSelector("img[title='EDIT']"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFitstName());
        type(By.name("lastname"), contactData.getLastName());
    }

    public void clickUpdateContactButton() {
        click(By.name("update"));
    }

    public void checkBoxContact() {
        click(By.name("selected[]"));
    }

    public void clickContactDetButton() {
        click(By.cssSelector("input[value='DELETE']"));
    }

    public void submitContactDel() {
        wd.switchTo().alert().accept();
    }


}
