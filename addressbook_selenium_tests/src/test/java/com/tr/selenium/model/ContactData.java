package com.tr.selenium.model;

import java.io.File;

public class ContactData {
    private String fitstName;
    private String lastName;
    private String address;
    private String phone;
    private String group;
    private File photo;

    public File getPhoto() {
        return photo;
    }

    public ContactData withPhoto(File photo) {
        this.photo = photo;
        return this;
    }


//    public ContactData(String fitstName, String lastName, String address, String phone) {
//        this.fitstName = fitstName;
//        this.lastName = lastName;
//        this.address = address;
//        this.phone = phone;
//    }

    public String getFitstName() {
        return fitstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getGroup() {
        return group;
    }

    public ContactData withFitstName(String fitstName) {
        this.fitstName = fitstName;
        return this;
    }

    public ContactData withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactData withAddress(String address) {
        this.address = address;
        return this;
    }

    public ContactData withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }
}
