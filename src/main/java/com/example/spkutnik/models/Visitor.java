package com.example.spkutnik.models;

import com.example.spkutnik.models.Book;
import com.example.spkutnik.models.Section;
import com.example.spkutnik.models.TableOfContents;
import com.example.spkutnik.models.Content.*;

public interface Visitor<T> {
    T visitBook(Book book);

    T visitSection(Section section);

    T visitTableOfContents(TableOfContents tableOfContents);

    T visitParagraph(Paragraph paragraph);

    T visitImageProxy(ImageProxy imageProxy);

    T visitImage(Image image);

    T visitTable(Table table);
}

