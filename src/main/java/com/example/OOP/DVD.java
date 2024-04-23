package com.example.OOP;

public class DVD extends Resource {
    public DVD(String title, String author, Integer publicationYear) {
        super(title, author, publicationYear);
    }

    public DVD() {
        super();
    }
    

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of Release: " + getPublicationYear());
    }
}
