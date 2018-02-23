package com.tr.selenium.Tests;

import org.testng.annotations.Test;

public class GroupDelTest extends TestBase {


    @Test
    public void testGroupDelTest() {
        app.goToGroupsPage();
        app.selectGroup();
        app.initGroupDeletion();
        app.returnToGroupsPage();
    }
}
