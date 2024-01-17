package com.example.spkutnik;

// AlignRight class
public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Align Right: " + paragraph.getText());
    }
}
