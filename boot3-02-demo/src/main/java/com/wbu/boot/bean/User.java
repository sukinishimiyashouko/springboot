package com.wbu.boot.bean;

/**
 * @auther 11852
 * @create 2023/6/5
 */
public class User {
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
