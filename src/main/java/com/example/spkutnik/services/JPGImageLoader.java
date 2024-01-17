package com.example.spkutnik.services;

// JPGImageLoader class
public class JPGImageLoader implements ImageLoader {
    @Override
    public ImageContent load(String imageName) {
        // Implement loading JPG image content
        return new JPGImageContent(imageName);
    }
}
