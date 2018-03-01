package com.tr.selenium.Tests;

import com.tr.selenium.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "Test1Header", "Test1Footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().returnToGroupsPage();
    }

}
