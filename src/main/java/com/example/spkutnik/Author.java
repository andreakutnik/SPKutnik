package com.example.spkutnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Author: " + this.name);
    }
}
