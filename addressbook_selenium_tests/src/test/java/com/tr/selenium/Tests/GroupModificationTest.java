package com.tr.selenium.Tests;

import com.tr.selenium.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void testModifGroup() {
        app.getNavigationHelper().goToGroupsPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData()
                .withGroupName("test1")
                .withGroupHeader("Test1Header")
                .withGroupFooter("Test1Footer"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().goToGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);


    }
}
