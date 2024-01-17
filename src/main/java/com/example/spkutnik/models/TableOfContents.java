package com.example.spkutnik.models;

import com.example.spkutnik.models.Book;
import com.example.spkutnik.models.Element;

import java.util.List;

public class TableOfContents implements Visitee{
    private Book book;

    public TableOfContents(Book book) {
        this.book = book;
    }

    public void printContents() {
        System.out.println("Table of Contents:");

        for (Element chapter : this.book.getChapters()) {
            System.out.println("- " + chapter.getName());
            printSubsections(chapter.getSubChapters(), 1);
        }
    }

    private void printSubsections(List<Element> subChapters, int level) {
        for (Element subChapter : subChapters) {
            String indentation = "  ".repeat(level);
            System.out.println(indentation + "- " + subChapter.getName());
            subChapter.print();
        }
    }

    @Override
    public void accept(Visitor<?> visitor) {

    }

    @Override
    public String render() {
        return null;
    }
}




