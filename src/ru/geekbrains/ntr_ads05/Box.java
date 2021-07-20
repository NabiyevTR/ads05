package ru.geekbrains.ntr_ads05;

import java.util.*;

public class Box<T extends Item> {

    private static final float DEFAULT_WEIGHT = 15f;
    private float maxWeight;
    private List items = new LinkedList();
    private float bestPrice;
    private List<T> bestCombination;

    public Box(List<T> items) {
        this(DEFAULT_WEIGHT, items);
    }

    public Box(float maxWeight, List<T> items) {
        this.items.addAll(items);
        this.maxWeight = maxWeight;
        process();
    }

    public Box(T... items) {
        this(DEFAULT_WEIGHT, items);
    }

    public Box(float maxWeight, T... items) {
        this.items.addAll(Arrays.asList(items));
        this.maxWeight = maxWeight;
        process();
    }

    public void clear() {
        items = null;
        bestCombination = null;
        bestPrice = 0;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
        process();
    }

    public void setItems(List items) {
        this.items = items;
        process();
    }

    public void setItems(T... items) {
        this.items = Arrays.asList(items);
        process();
    }

    public void addItem(T item) {
        items.add(item);
        process();
    }

    public void addAllItems(List<T> items) {
        items.addAll(items);
        process();
    }

    public void removeItem(T item) {
        items.remove(item);
        process();
    }

    public void removeAllItems(List<T> items) {
        items.removeAll(items);
        process();
    }

    public List<T> getBestCombination() {
        return bestCombination;
    }

    public void process() {
        bestCombination = null;
        bestPrice = 0;
        processCombinations(items);
    }

    private void processCombinations(List<T> items) {

        if (items.size() > 0) {
            checkCombination(items);
        }

        for (int i = 0; i < items.stream().count(); i++) {
            List<T> newItemList = new LinkedList<>(items);
            newItemList.remove(i);
            processCombinations(newItemList);
        }
    }

    private float getItemsWeight(List<T> items) {
        return items.stream().map(e -> e.getWeight()).reduce(0f, Float::sum);
    }

    private float getItemsPrice(List<T> items) {
        return items.stream().map(e -> e.getPrice()).reduce(0f, Float::sum);
    }

    private void checkCombination(List<T> items) {
        if (bestCombination == null || bestCombination.size() == 0) {
            if (getItemsWeight(items) < maxWeight) {
                bestCombination = items;
                bestPrice = getItemsPrice(items);
            }
        } else if (getItemsWeight(items) < maxWeight && getItemsPrice(items) > bestPrice) {
            bestCombination = items;
            bestPrice = getItemsPrice(items);
        }
    }

    public void display() {
        bestCombination.forEach(e -> System.out.printf("%s %.3f кг %.2f р\n", e.getName(), e.getWeight(), e.getPrice()));
        System.out.printf("Вес рюказака: %.3f кг\n", getItemsWeight(bestCombination));
        System.out.printf("Стоимость содержимого: %.2f р\n", getItemsPrice(bestCombination));
    }
}
