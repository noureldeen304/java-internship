package com.example.OOP;

public abstract class Resource {
    private String title;
    private Integer publicationYear; 
    
    public Resource(String title, Integer publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;

    }

    

    public String getTitle() {
        return title;
    }



    public Integer getPublicationYear() {
        return publicationYear;
    }



    public abstract void displayInfo();
}