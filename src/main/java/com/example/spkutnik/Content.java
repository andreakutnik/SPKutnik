package com.example.spkutnik;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class Content implements Element {
    public abstract String getImage();

    public abstract void print();
}

class Paragraph extends Content {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = new AlignLeft();
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
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

    public void print() {
        alignStrategy.render(this);
    }

    public String getText() {
        return this.text;
    }

    public void setAlignStrategy(AlignCenter alignCenter) {
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
