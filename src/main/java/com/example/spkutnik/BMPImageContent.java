package com.example.spkutnik;

// BMPImageContent class
public class BMPImageContent implements ImageContent {
    private String content;

    public BMPImageContent(String imageName) {
        // Load BMP image content
        this.content = "BMP Image Content for " + imageName;
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
