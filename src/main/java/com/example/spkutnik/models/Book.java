package com.example.spkutnik.models;

import java.util.ArrayList;
import java.util.List;

public class Book implements Visitee {
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

    public String render() {
        StringBuilder renderedContent = new StringBuilder("Book: " + this.title + "\nAuthors:\n");

        for (Author author : this.authors) {
            renderedContent.append(author.display()).append("\n");
        }

        for (Element element : this.elements) {
            renderedContent.append(element.render()).append("\n");
        }

        return renderedContent.toString();
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

    @Override
    public void accept(Visitor<?> visitor) {
        visitor.visitBook(this);
        for (Element element : this.elements) {
            element.accept(visitor);
        }
    }
}

