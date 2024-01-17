package com.example.spkutnik;

public class ImageLoaderFactory {

    public static ImageLoader create(String imageName) {
        // Check image format and return the appropriate ImageLoader
        if (imageName.endsWith(".bmp")) {
            return new BMPImageLoader();
        } else if (imageName.endsWith(".jpg")) {
            return new JPGImageLoader();
        } else {
            throw new UnsupportedOperationException("Unsupported image format");
        }
    }
}

