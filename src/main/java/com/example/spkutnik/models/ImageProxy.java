package com.example.spkutnik.models;

import java.util.List;

public class ImageProxy implements Element {
    private String url;
    private String dimensions;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    private void loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
    }

    @Override
    public String getName() {
        return "Image Proxy";
    }

    @Override
    public List<Element> getSubChapters() {
        loadImage();
        return realImage.getSubChapters();
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
    public void accept(Visitor<?> visitor) {

    }

    @Override
    public void print() {
        loadImage();
        System.out.println("Image Proxy with URL: " + url + ", Dimensions: " + dimensions);
        realImage.print();
    }
}
