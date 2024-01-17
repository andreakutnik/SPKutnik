package com.example.spkutnik;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Image extends Content {
    private String name;

    public Image(String name) {
        this.name = name;
        addDelay();
        loadImage();
    }

    private void addDelay() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void loadImage() {
        ImageLoaderFactory.create(this.name).load(this.name);
    }

    @Override
    public String getImage() {
        return "Image";
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public List<Element> getSubChapters() {
        return null;
    }

    @Override
    public List<Section> getSubchapters() {
        return null;
    }
}
