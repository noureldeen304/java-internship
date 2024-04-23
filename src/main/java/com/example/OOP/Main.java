package com.example.OOP;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
    
        library.addResource(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.addResource(new Magazine("National Geographic", "National Geographic Society", 2022));
        library.addResource(new DVD("Inception", "Christopher Nolan", 2010));

        library.displayAllResources();

    }
}
