package com.telRan.course.tests;

import com.telRan.course.model.ListData;
import org.testng.annotations.Test;

public class ListCreateTest  extends TestBase {


    @Test
    public void testListCreate(){
        app.findBoard("ForListTests");
        app.clickAddList();
        app.enterNewListName(new ListData("FirstList"));
        app.clickSaveListButton();


    }



}
