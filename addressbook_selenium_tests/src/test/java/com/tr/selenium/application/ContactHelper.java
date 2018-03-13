package com.tr.selenium.application;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }


    public void goToAddNewContactePage() {
        click(By.cssSelector("a[href='edit.php']"));
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
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getPhone());
        new Select(wd.findElement(By.name("new_group")))
                .selectByVisibleText(contactData.getGroup());
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


    public int getContactCount() {
        return wd.findElements(By.cssSelector("img[title='EDIT']")).size();
    }

    public boolean isContactExists() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createContact() {
        goToAddNewContactePage();
        fillContactForm(new ContactData()
                .withFitstName("Dina")
                .withLastName("Kuzinets")
                .withAddress("Rishon")
                .withPhone("123456789"));
        clickEnterContactButton();
    }
}
