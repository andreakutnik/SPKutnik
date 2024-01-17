package com.example.spkutnik;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Align Center: " + paragraph.getText());
    }
}
