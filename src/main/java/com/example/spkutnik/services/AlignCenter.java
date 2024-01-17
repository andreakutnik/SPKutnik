package com.example.spkutnik.services;

import com.example.spkutnik.models.Paragraph;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Align Center: " + paragraph.getText());
    }
}
