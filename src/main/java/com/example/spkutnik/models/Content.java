package com.example.spkutnik.models;

import com.example.spkutnik.services.AlignCenter;
import com.example.spkutnik.services.AlignLeft;
import com.example.spkutnik.services.AlignStrategy;
import com.example.spkutnik.models.Section;

import java.util.List;

public abstract class Content implements Element, Visitee {

    public abstract String getImage();

    public abstract void print();
}

