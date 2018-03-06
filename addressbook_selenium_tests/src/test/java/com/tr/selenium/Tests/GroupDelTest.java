package com.tr.selenium.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDelTest extends TestBase {


    @Test
    public void testGroupDelTest() {
        app.getNavigationHelper().goToGroupsPage();
        if(!app.getGroupHelper().isGroupExists()){
            app.getGroupHelper().createGroup();
        }
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupDeletion();
        app.getNavigationHelper().goToGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before-1);
    }
}
