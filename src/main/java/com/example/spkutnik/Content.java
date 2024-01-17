package com.example.spkutnik;

import java.util.List;

public abstract class Content implements Element {
    public abstract String getImage();

    public abstract void print();
}

class Paragraph extends Content {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public String getName() {
        return "Paragraph";
    }

    @Override
    public List<Element> getSubChapters() {
        return null;
    }

    @Override
    public List<Section> getSubchapters() {
        return null;
    }

    @Override
    public String getImage() {
        return null;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + this.text);
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

    @Override
    public String getImage() {
        return "Image";
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public List<Element> getSubChapters() {
        return null;
    }

    @Override
    public List<Section> getSubchapters() {
        return null;
    }
}


class Table extends Content {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public String getName() {
        return "Table";
    }

    @Override
    public List<Element> getSubChapters() {
        return null;
    }

    @Override
    public List<Section> getSubchapters() {
        return null;
    }

    @Override
    public String getImage() {
        return null;
    }

    @Override
    public void print() {
        System.out.println("Table with title: " + this.title);
    }

    public String getTitle() {
        return this.title;
    }
}
