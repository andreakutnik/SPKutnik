package com.example.spkutnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpKutnikApplication {

    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        new Author("Radu Pavel Gheo");
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewParagraph("Paragraph 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewParagraph("Paragraph 5");
        scOneOne.print();
        discoTitanic.displayTableOfContents();
        Iterator var7 = discoTitanic.authors.iterator();

        while(var7.hasNext()) {
            Author author1 = (Author)var7.next();
            author1.display();
        }

    }

    static class Book {
        private String title;
        private List<Author> authors;
        private List<Chapter> chapters;

        public Book(String title) {
            this.title = title;
            this.authors = new ArrayList();
            this.chapters = new ArrayList();
        }

        public void addAuthor(Author author) {
            this.authors.add(author);
        }

        public int createChapter(String chapterTitle) {
            Chapter chapter = new Chapter(chapterTitle);
            this.chapters.add(chapter);
            return this.chapters.indexOf(chapter);
        }

        public Chapter getChapter(int index) {
            return (Chapter)this.chapters.get(index);
        }

        public void displayTableOfContents() {
            System.out.println("Table of Contents:");
            Iterator var1 = this.chapters.iterator();

            while(var1.hasNext()) {
                Chapter chapter = (Chapter)var1.next();
                chapter.print();
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

    static class Chapter {
        private String title;
        private List<SubChapter> subChapters;

        public Chapter(String title) {
            this.title = title;
            this.subChapters = new ArrayList();
        }

        public int createSubChapter(String subchapterTitle) {
            SubChapter subchapter = new SubChapter(subchapterTitle);
            this.subChapters.add(subchapter);
            return this.subChapters.indexOf(subchapter);
        }

        public SubChapter getSubChapter(int index) {
            return (SubChapter)this.subChapters.get(index);
        }

        public List<SubChapter> getSubChapter() {
            return this.subChapters;
        }

        public void print() {
            System.out.println("Chapter: " + this.title);
            Iterator var1 = this.subChapters.iterator();

            while(var1.hasNext()) {
                SubChapter subChapter = (SubChapter)var1.next();
                subChapter.print();
            }

        }
    }

    static class SubChapter {
        private String title;
        private List<String> content;

        public SubChapter(String title) {
            this.title = title;
            this.content = new ArrayList();
        }

        public void createNewParagraph(String paragraph) {
            this.content.add("Paragraph: " + paragraph);
        }

        public void createNewImage(String image) {
            this.content.add("Image: " + image);
        }

        public void createNewTable(String table) {
            this.content.add("Table: " + table);
        }

        public void print() {
            System.out.println("SubChapter: " + this.title);
            Iterator var1 = this.content.iterator();

            while(var1.hasNext()) {
                String item = (String)var1.next();
                System.out.println("  - " + item);
            }

        }
    }
}
