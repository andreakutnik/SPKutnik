package com.example.spkutnik.models;

import java.util.List;

public class Table extends Content {
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
    public String render() {
        return new String(new char[0]);
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

    @Override
    public void accept(Visitor<?> visitor) {
        visitor.visitTable(this);
    }
}
