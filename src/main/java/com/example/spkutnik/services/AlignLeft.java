package com.example.spkutnik.services;

import com.example.spkutnik.models.Paragraph;

// AlignLeft class
public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Align Left: " + paragraph.getText());
    }
}
