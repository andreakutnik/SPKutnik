package com.example.spkutnik.services;

// BMPImageLoader class
public class BMPImageLoader implements ImageLoader {
    @Override
    public ImageContent load(String imageName) {
        // Implement loading BMP image content
        return new BMPImageContent(imageName);
    }
}
