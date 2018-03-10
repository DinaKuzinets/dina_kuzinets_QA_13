package com.tr.selenium.Tests;

import com.tr.selenium.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void testModifGroup() {
        app.getNavigationHelper().goToGroupsPage();
        if(!app.getGroupHelper().isGroupExists()){
            app.getGroupHelper().createGroup();
        }
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData()
                .withGroupName("test77")
                .withGroupHeader("Test77Header")
                .withGroupFooter("Test77Footer"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);


    }
}
