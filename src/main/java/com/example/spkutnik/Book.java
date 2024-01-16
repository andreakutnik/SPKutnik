package com.example.spkutnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Book {
    private String title;
    private List<Author> authors;
    private List<Content> content;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.content = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addContent(Content contentItem) {
        this.content.add(contentItem);
    }

    public void print() {
        System.out.println("Book: " + this.title);
        System.out.println("Authors:");

        for (Author author : this.authors) {
            author.display();
        }

        for (Content item : this.content) {
            item.print();
        }
    }
}