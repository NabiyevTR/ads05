package ru.geekbrains.ntr_ads05;

import javax.swing.*;

public class Book  extends AbstractItem {
    private static final float DEFAULT_WEIGHT = 0.5f;
    private static final float DEFAULT_PRICE = 400f;

    public Book(String name, float weight, float price) {
        super("Книга: "+  name, weight, price);
    }

    public Book(String name) {
        super("Книга: "+  name, DEFAULT_WEIGHT, DEFAULT_PRICE);

    }
}
