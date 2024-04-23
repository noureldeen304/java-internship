package com.example.OOP;

public class Magazine extends Resource{
    private String publisher;

    public Magazine(String title, String author, Integer publicationYear) {
        super(title, publicationYear);
        this.publisher = author;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getPublisher());
        System.out.println("Year of Publication: " + getPublicationYear());
    }

    public String getPublisher() {
        return publisher;
    }

}
