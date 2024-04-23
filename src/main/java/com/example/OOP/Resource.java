package com.example.OOP;

public abstract class Resource {
    private Integer id;
    private String title;
    private String author;
    private Integer publicationYear;

    public Resource(String title, String author, Integer publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public Resource() {
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public abstract void displayInfo();

    public Integer getId() {
        return id;
    }
}