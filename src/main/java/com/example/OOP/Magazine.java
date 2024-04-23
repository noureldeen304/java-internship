package com.example.OOP;

public class Magazine extends Resource {

    public Magazine(String title, String author, Integer publicationYear) {
        super(title, author, publicationYear);
    }

    public Magazine() {
        super();
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of Publication: " + getPublicationYear());
    }

}
