package com.example.spkutnik.models;

public interface Visitee {
    void accept(Visitor<?> visitor);
    String render();
}
