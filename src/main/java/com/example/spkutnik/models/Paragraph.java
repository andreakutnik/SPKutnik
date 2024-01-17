package com.example.spkutnik.models;

import com.example.spkutnik.services.AlignCenter;
import com.example.spkutnik.services.AlignLeft;
import com.example.spkutnik.services.AlignStrategy;

import java.util.List;

public class Paragraph extends Content {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = new AlignLeft();
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public String getName() {
        return "Paragraph";
    }

    @Override
    public List<Element> getSubChapters() {
        return null;
    }

    @Override
    public List<Section> getSubchapters() {
        return null;
    }

    @Override
    public String render() {
        return null;
    }

    @Override
    public String getImage() {
        return null;
    }

    public void print() {
        alignStrategy.render(this);
    }

    public String getText() {
        return this.text;
    }

    public void setAlignStrategy(AlignCenter alignCenter) {
    }

    @Override
    public void accept(Visitor<?> visitor) {

    }
}
