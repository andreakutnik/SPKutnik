package com.example.spkutnik;

import java.util.List;

public class ImageProxy implements Element {
    private String url;
    private String dimensions;
    private Image realImage;

    public ImageProxy(String url, String dimensions) {
        this.url = url;
        this.dimensions = dimensions;
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
    public void print() {
        loadImage();
        System.out.println("Image Proxy with URL: " + url + ", Dimensions: " + dimensions);
        realImage.print();
    }
}
