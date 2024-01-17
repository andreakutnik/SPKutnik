package com.example.spkutnik.models;

import com.example.spkutnik.models.SubChapter;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<>();
    }

    public void addSubChapter(SubChapter subChapter) {
        this.subChapters.add(subChapter);
    }

    public void print() {
        System.out.println("Chapter: " + this.name);

        for (SubChapter subChapter : this.subChapters) {
            subChapter.print();
        }
    }

    // Create a new SubChapter with the given name and add it to the Chapter
    public int createNewSubChapter(String name) {
        SubChapter subChapter = new SubChapter(name);
        this.addSubChapter(subChapter);
        return this.subChapters.indexOf(subChapter);
    }

    public List<SubChapter> getSubChapters() {
        return this.subChapters;
    }

    // Get the SubChapter at the specified index
    public SubChapter getSubChapter(int index) {
        if (index >= 0 && index < this.subChapters.size()) {
            return this.subChapters.get(index);
        } else {
            return null; // or throw an exception based on your application's logic
        }
    }

    public String getName() {
        return this.name;
    }
}

