package com.example.spkutnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SpKutnikApplication {

    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author author = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(author);
        int indexChapterOne = discoTitanic.createNewChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createNewSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewParagraph("Paragraph 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewParagraph("Paragraph 5");
        scOneOne.print();
    }
}
