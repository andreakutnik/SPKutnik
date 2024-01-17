package com.example.spkutnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

class Book {
    private String title;
    private List<Author> authors;
    private List<Element> elements;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addContent(Element element) {
        this.elements.add(element);
    }

    public void print() {
        System.out.println("Book: " + this.title);
        System.out.println("Authors:");

        for (Author author : this.authors) {
            author.display();
        }

        for (Element element : this.elements) {
            element.print();
        }
    }

    public List<Element> getChapters() {
        List<Element> chapters = new ArrayList<>();
        for (Element element : this.elements) {
            if (element instanceof Section) {
                chapters.add(element);
            }
        }
        return chapters;
    }
}

