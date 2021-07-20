package ru.geekbrains.ntr_ads05;

public class NoteBook extends AbstractItem {
    private static final float DEFAULT_WEIGHT = 5f;
    private static final float DEFAULT_PRICE = 25000f;

    public NoteBook(String name, float weight, float price) {
        super("Ноутбук: " + name, weight, price);
    }

    public NoteBook(String name) {
        super("Ноутбук: " + name, DEFAULT_WEIGHT, DEFAULT_PRICE);
    }
}
