package com.tr.selenium.Tests;

import org.testng.annotations.Test;

public class GroupDelTest extends TestBase {


    @Test
    public void testGroupDelTest() {
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupeHelper().selectGroup();
        app.getGroupeHelper().initGroupDeletion();
        app.getGroupeHelper().returnToGroupsPage();
    }
}
