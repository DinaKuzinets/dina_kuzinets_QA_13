package com.telRan.course.model;

public class ListData {
    private String listName;

//    public ListData(String listName) {
//        this.listName = listName;
//    }

    public String getListName() {
        return listName;
    }

    public ListData withListName(String listName) {
        this.listName = listName;
        return this;
    }
}
