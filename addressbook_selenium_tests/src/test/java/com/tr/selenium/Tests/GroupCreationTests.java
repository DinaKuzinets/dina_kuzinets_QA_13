package com.tr.selenium.Tests;

import com.tr.selenium.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupeHelper().initGroupCreation();
        app.getGroupeHelper().fillGroupForm(new GroupData("test1", "Test1Header", "Test1Footer"));
        app.getGroupeHelper().submitGroupCreation();
        app.getGroupeHelper().returnToGroupsPage();
    }

}