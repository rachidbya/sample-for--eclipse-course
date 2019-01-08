package org.bya.model;


public class User {
    private String name;
    private int age;

    public User() {
        super();
    }

    public User(String aName, int aAge) {
        super();
        name = aName;
        age = aAge;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int aAge) {
        age = aAge;
    }

    public void setName(String aName) {
        name = aName;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }

}
