package com.wbu;

import java.util.Objects;

/**
 * @auther 11852
 * @create 2023/6/7
 */
public class User {
    private int age;
    private String name;

    public static String nation="China";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o instanceof User){
            User user = (User)o;
            return this.age == user.age&&this.name.equals(user.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
