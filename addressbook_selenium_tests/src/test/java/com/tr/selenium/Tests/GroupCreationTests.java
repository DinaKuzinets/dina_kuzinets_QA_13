package com.tr.selenium.Tests;

import com.tr.selenium.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupsPage();
        app.initGroupCreation();
        app.keepGroupForm(new GroupData("test1", "Test1Header", "Test1Footer"));
        app.submitGroupCreation();
        app.returnToGroupsPage();
    }

}
