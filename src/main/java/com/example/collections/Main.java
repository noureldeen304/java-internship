package com.example.collections;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.store("Apple");
        dictionary.store("Action");
        dictionary.store("Agency");

        dictionary.store("Monkey");
        dictionary.store("Modern");
        dictionary.store("Monday");

        dictionary.store("Cat");
        dictionary.store("Car");
        dictionary.store("Calendar");



        dictionary.printAll();
    }
}
