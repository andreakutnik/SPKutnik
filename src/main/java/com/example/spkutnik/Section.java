package com.example.spkutnik;

import java.util.ArrayList;
import java.util.List;

class Section extends Content {
    private String title;
    private List<Content> content;

    public Section(String title) {
        this.title = title;
        this.content = new ArrayList<>();
    }

    public void add(Content contentItem) {
        this.content.add(contentItem);
    }

    public void print() {
        System.out.println(this.title);

        for (Content item : this.content) {
            item.print();
        }
    }
}
