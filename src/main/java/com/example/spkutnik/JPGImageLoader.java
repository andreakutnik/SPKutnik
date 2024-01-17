package com.example.spkutnik;

// JPGImageLoader class
public class JPGImageLoader implements ImageLoader {
    @Override
    public ImageContent load(String imageName) {
        // Implement loading JPG image content
        return new JPGImageContent(imageName);
    }
}
