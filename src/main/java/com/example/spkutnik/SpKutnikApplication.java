package com.example.spkutnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpKutnikApplication {

    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);
        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent(cap1);
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));

        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));

        noapteBuna.print();
    }

    static class Book {
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

    static class Author {
        private String name;

        public Author(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("Author: " + this.name);
        }
    }

    static abstract class Content {
        public abstract void print();
    }

    static class Paragraph extends Content {
        private String text;

        public Paragraph(String text) {
            this.text = text;
        }

        public void print() {
            System.out.println("Paragraph: " + this.text);
        }
    }

    static class Section extends Content {
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

    static class Image extends Content {
        private String name;

        public Image(String name) {
            this.name = name;
        }

        public void print() {
            System.out.println("Image with name: " + this.name);
        }
    }
}
