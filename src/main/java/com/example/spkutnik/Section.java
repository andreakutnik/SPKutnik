package com.example.spkutnik;

import java.util.ArrayList;
import java.util.List;

class Section implements Element {
    private String name;
    private List<Element> elements;

    public Section(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(Element element) {
        this.elements.add(element);
    }

    public List<Element> getElements() {
        return this.elements;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Element> getSubChapters() {
        return null;
    }

    @Override
    public void print() {
        System.out.println(this.name);

        for (Element element : this.elements) {
            element.print();
        }
    }

    @Override
    public List<Section> getSubchapters() {
        List<Section> subchapters = new ArrayList<>();
        for (Element element : this.elements) {
            if (element instanceof Section) {
                subchapters.add((Section) element);
            }
        }
        return subchapters;
    }
}
