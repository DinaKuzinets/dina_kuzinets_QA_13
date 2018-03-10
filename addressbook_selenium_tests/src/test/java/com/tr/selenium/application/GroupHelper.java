package com.tr.selenium.application;

import com.tr.selenium.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getGroupName());
        type(By.name("group_header"), groupData.getGroupHeader());
        type(By.name("group_footer"), groupData.getGroupFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupDeletion() {
        click(By.name("delete"));
    }

    public int getGroupCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void returnToGroupPage(){
        click(By.cssSelector("a[href='group.php']"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public boolean isGroupExists() {
        return isElementPresent(By.name("selected[]"));
    }
    public void createGroup() {
        initGroupCreation();
        fillGroupForm(new GroupData()
                .withGroupName("test1")
                .withGroupHeader("Test1Header")
                .withGroupFooter("Test1Footer"));
        submitGroupCreation();
        returnToGroupPage();
    }
}

