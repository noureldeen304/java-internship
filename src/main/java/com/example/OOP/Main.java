package com.example.OOP;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Resource book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Resource magazine = new Magazine("National Geographic", "National Geographic Society", 2022);
        Resource dvd = new DVD("Inception", "Christopher Nolan", 2010);
        

        library.addResource(magazine);
        library.addResource(dvd);

        library.displayAllResources();

        library.updateResource(1, book);

        System.out.println("*********************************************");

        library.displayAllResources();

    }
}
