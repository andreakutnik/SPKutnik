package com.example.spkutnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Book {
    private String title;
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.chapters = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addChapter(Chapter chapter) {
        this.chapters.add(chapter);
    }

    public List<Chapter> getChapters() {
        return this.chapters;
    }

    public void print() {
        System.out.println("Book: " + this.title);
        System.out.println("Authors:");

        for (Author author : this.authors) {
            author.display();
        }

        for (Chapter chapter : this.chapters) {
            chapter.print();
        }
    }

    // Create a new Chapter with the given name and add it to the Book
    public int createNewChapter(String name) {
        Chapter chapter = new Chapter(name);
        this.addChapter(chapter);
        return this.chapters.indexOf(chapter);
    }

    // Get the Chapter at the specified index
    public Chapter getChapter(int index) {
        if (index >= 0 && index < this.chapters.size()) {
            return this.chapters.get(index);
        } else {
            return null; // or throw an exception based on your application's logic
        }
    }
}
