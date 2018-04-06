package com.telRan.course.model;

import java.io.File;

public class ProfileData {
    File photo;

    public File getPhoto() {
        return photo;
    }

    public ProfileData withPhoto(File photo) {
        this.photo = photo;
        return this;
    }
}
