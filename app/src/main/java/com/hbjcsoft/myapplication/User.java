package com.hbjcsoft.myapplication;

/**
 * Created by kohry on 2017-03-05.
 */

public class User {
    private String id;
    private String friend;

    public User(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
