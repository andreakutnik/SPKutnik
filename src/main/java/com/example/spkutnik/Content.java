package com.example.spkutnik;

import java.util.ArrayList;
import java.util.List;

public abstract class Content {
    public abstract void print();
}

class Paragraph extends Content {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + this.text);
    }

    public String getParagraph() {
        return this.text;
    }

    public String getText() {
        return this.text;
    }
}

class Image extends Content {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Image with name: " + this.name);
    }

    public String getName() {
        return this.name;
    }
}

class Table extends Content {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table: " + this.title);
    }

    public String getTitle() {
        return this.title;
    }
}
