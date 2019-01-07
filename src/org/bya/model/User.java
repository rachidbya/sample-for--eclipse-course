package org.bya.model;


public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    @Override
    public String toString() {
        return "User [name=" + name + "]";
    }
}
