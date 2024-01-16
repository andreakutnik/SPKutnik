package com.example.spkutnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class ImageProxy extends Content {
    private Image realImage;
    public String name;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        if (realImage == null) {
            realImage = new Image(name);
        }
        realImage.print();
    }
}
