package com.smanov.lesson4.animal;

import com.smanov.lesson4.Drawable;
import com.smanov.lesson4.SoundProducable;

public abstract class Animal implements Drawable, SoundProducable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
