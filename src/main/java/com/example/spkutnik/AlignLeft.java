package com.example.spkutnik;

// AlignLeft class
public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Align Left: " + paragraph.getText());
    }
}
