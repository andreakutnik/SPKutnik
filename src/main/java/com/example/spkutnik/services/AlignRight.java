package com.example.spkutnik.services;

import com.example.spkutnik.models.Paragraph;

// AlignRight class
public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Align Right: " + paragraph.getText());
    }
}
