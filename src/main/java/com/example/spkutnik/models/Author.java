package com.example.spkutnik.models;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public Object display() {
        System.out.println("Author: " + this.name);
        return null;
    }
}