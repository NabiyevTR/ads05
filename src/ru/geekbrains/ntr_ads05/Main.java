package ru.geekbrains.ntr_ads05;

import static ru.geekbrains.ntr_ads05.MathUtils.*;

public class Main {

    public static void main(String[] args) {

        //Задание 1. Возведение в степень
        powAndDisplay(2, 2);
        powAndDisplay(-2, 4);
        powAndDisplay(-2.5, 0);
        powAndDisplay(2, -2);
        System.out.println("--------------------");

        //Задание 2. Задача о рюкзаке.
        Box box = new Box(
                new Book("Паттерны проектирования", 2f, 1200f),
                new Book("Война и мир", 5f, 700f),
                new Book("Spring в действии"),
                new Book("Spring в действии"),
                new Book("Spring в действии"),
                new Book("Spring в действии"),
                new Book("MVC .NET"),
                new Book("Преступление и наказание"),
                new DifferentStuff("Телефон", 0.4f, 35000f),
                new DifferentStuff("Планшет", 0.9f, 45000f)
        );
        box.display();
        System.out.println("--------------------");

        box.setMaxWeight(10f);
        box.addItem(
                new NoteBook("HP8570w")
        );
        box.display();
        System.out.println("--------------------");

        box.setMaxWeight(3f);
        box.display();

    }
}
