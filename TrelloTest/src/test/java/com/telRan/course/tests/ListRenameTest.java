package com.telRan.course.tests;

import com.telRan.course.model.ListData;
import org.testng.annotations.Test;

public class ListRenameTest extends TestBase{

    @Test
    public void testRenameList(){
        app.getBoardHelper().findBoard("1313");
        app.getListHelper().findList();
        app.getListHelper().fillRenameListTitle(new ListData("MyList"));
        app.getNavigationHelper().returnToHomepage();
        app.getBoardHelper().clickSpareSpace();
    }
}
