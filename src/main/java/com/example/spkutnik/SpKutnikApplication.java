package com.example.spkutnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SpKutnikApplication {

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        ImageProxy img1 = new ImageProxy("Pamela Anderson");
        ImageProxy img2 = new ImageProxy("Kim Kardashian");
        ImageProxy img3 = new ImageProxy("Kirby Griffin");
        Section playboyS1 = new Section("Front Cover");
        playboyS1.add(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);
        Book playboy = new Book("Playboy");
        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");
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
    public static class ImageProxy extends Content {
        private Image realImage;
        public String name;

        public ImageProxy(String name) {
            this.name = name;
        }

        @Override
        public void print() {
            if (realImage == null) {
                realImage = new Image(name);
            }
            realImage.print();
        }
    }

    static class Image extends ImageProxy {
        public Image(String name) {
            super(name);
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void print() {
            System.out.println("Image with name: " + this.name);
        }
    }
}
