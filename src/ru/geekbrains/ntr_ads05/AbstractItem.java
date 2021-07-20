package ru.geekbrains.ntr_ads05;

public abstract class AbstractItem implements Item {
    private String name;
    private float weight;
    private float price;

    public AbstractItem(String name, float weight, float price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
