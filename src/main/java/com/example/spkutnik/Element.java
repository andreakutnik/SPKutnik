package com.example.spkutnik;

import java.util.List;

interface Element {
    void print();
    String getName();

    List<Element> getSubChapters();

    List<Section> getSubchapters();
}
