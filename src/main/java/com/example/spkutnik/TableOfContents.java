package com.example.spkutnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TableOfContents {
    private Book book;

    public TableOfContents(Book book) {
        this.book = book;
    }

    public void printContents() {
        System.out.println("Table of Contents:");

        for (Chapter chapter : this.book.getChapters()) {
            System.out.println("- " + chapter.getName());
            printSubsections(chapter.getSubChapters(), 1);
        }
    }

    private void printSubsections(List<SubChapter> subChapters, int level) {
        for (SubChapter subChapter : subChapters) {
            String indentation = "  ".repeat(level);
            System.out.println(indentation + "- " + subChapter.getName());
            printContent(subChapter.getContent(), level + 1);
        }
    }

    private void printContent(List<Content> contentList, int level) {
        for (Content item : contentList) {
            if (item instanceof Paragraph) {
                Paragraph paragraph = (Paragraph) item;
                String indentation = "  ".repeat(level);
                System.out.println(indentation + "- " + paragraph.getText());
            } else if (item instanceof Image) {
                Image image = (Image) item;
                String indentation = "  ".repeat(level);
                System.out.println(indentation + "- " + image.getName());
            } else if (item instanceof Table) {
                Table table = (Table) item;
                String indentation = "  ".repeat(level);
                System.out.println(indentation + "- " + table.getTitle());
            }
        }
    }
}


