package com.telRan.course.tests;

import com.telRan.course.model.ListData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListRenameTest extends TestBase{

    @Test
    public void testRenameList(){
        app.getBoardHelper().findBoard("ForListTests");
        if(!app.getListHelper().isListExists()){
            app.getListHelper().createList();
        }
        int before = app.getListHelper().getListCount();
        app.getListHelper().findList();
        app.getListHelper().fillRenameListTitle(new ListData().withListName("MyList"));
        app.getListHelper().clickListSpareSpace();
        int after = app.getListHelper().getListCount();
        Assert.assertEquals(after,before);
        app.getNavigationHelper().goToHomepage();
        app.getBoardHelper().clickBoardSpareSpace();
    }
}
