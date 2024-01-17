package com.example.spkutnik.models;

import java.util.List;

interface Element {
    void print();
    String getName();

    List<Element> getSubChapters();

    List<Section> getSubchapters();

    String render();

    void accept(Visitor<?> visitor);
}
