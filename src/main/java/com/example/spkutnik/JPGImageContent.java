package com.example.spkutnik;

// JPGImageContent class
public class JPGImageContent implements ImageContent {
    private String content;

    public JPGImageContent(String imageName) {
        // Load JPG image content
        this.content = "JPG Image Content for " + imageName;
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
