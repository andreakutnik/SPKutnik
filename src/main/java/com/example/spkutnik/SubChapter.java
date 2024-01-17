package com.example.spkutnik;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Content> content;

    public SubChapter(String name) {
        this.name = name;
        this.content = new ArrayList<>();
    }

    public void addContent(Content contentItem) {
        this.content.add(contentItem);
    }

    public void print() {
        System.out.println("SubChapter: " + this.name);

        for (Content item : this.content) {
            item.print();
        }
    }
    public void createNewParagraph(String text) {
        Paragraph paragraph = new Paragraph(text);
        this.addContent(paragraph);
    }

    public void createNewImage(String name) {
        Image image = new Image(name);
        this.addContent(image);
    }

    public void createNewTable(String title) {
        Table table = new Table(title);
        this.addContent(table);
    }

    public String getName() {
        return this.name;
    }

    public List<Content> getContent() {
        return this.content;
    }
}
