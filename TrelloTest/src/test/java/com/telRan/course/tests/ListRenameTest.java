package com.telRan.course.tests;

import org.testng.annotations.Test;

public class ListRenameTest extends TestBase{

    @Test
    public void testRenameList(){
        app.findBoard("ForListTests");
        app.findList("FirstList");
        app.fillRenameListTitle("MyList");
       // app.clickSpareSpace();
    }
}
