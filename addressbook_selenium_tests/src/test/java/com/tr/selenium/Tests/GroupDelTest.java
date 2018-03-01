package com.tr.selenium.Tests;

import org.testng.annotations.Test;

public class GroupDelTest extends TestBase {


    @Test
    public void testGroupDelTest() {
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupDeletion();
        app.getNavigationHelper().returnToGroupsPage();
    }
}
