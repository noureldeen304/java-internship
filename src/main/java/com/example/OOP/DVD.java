package com.example.OOP;

public class DVD extends Resource {
    private String director;

    public DVD(String title, String author, Integer publicationYear) {
        super(title, publicationYear);
        this.director = author;
    }

    

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getDirector());
        System.out.println("Year of Release: " + getPublicationYear());
    }



    public String getDirector() {
        return director;
    }
}
