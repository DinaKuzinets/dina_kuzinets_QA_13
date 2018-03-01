package com.tr.selenium.model;

public class ContactData {
    private final String fitstName;
    private final String lastName;

    public ContactData(String fitstName, String lastName) {
        this.fitstName = fitstName;
        this.lastName = lastName;
    }

    public String getFitstName() {
        return fitstName;
    }

    public String getLastName() {
        return lastName;
    }
}
