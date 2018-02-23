package com.telRan.course.tests;

import com.telRan.course.model.ListData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ListRenameTest extends TestBase{

    @Test
    public void testRenameList(){
        app.findBoard("ForListTests");
        app.findList();
        app.fillRenameListTitle(new ListData("MyList"));
    }
}
