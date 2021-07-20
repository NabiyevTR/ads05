package ru.geekbrains.ntr_ads05;

public class DifferentStuff extends AbstractItem {
    private static final float DEFAULT_WEIGHT = 0.2f;
    private static final float DEFAULT_PRICE = 600f;

    public DifferentStuff (String name, float weight, float price) {
        super(name, weight, price);
    }

    public DifferentStuff (String name) {
        super(name, DEFAULT_WEIGHT, DEFAULT_PRICE);
    }

}
