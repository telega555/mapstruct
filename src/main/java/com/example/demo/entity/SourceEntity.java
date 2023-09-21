package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;


public class SourceEntity {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

// Геттеры и сеттеры
}