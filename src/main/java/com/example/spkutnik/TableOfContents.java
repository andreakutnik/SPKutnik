package com.example.spkutnik;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class TableOfContents {
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
}




