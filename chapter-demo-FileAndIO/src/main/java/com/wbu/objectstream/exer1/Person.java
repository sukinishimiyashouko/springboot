package com.wbu.objectstream.exer1;

import java.io.Serializable;

/**
 * @auther 11852
 * @create 2023/6/10
 */
public class Person implements Serializable {//Serializable 标识接口
    private static final long serialVersionUID=42234234L;
    private String name;
    private int age;

//    private String sex;

//    public Person(String name, int age, String sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
