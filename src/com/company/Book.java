package com.company;

public class Book {
    private String nameBook;
    private int yearCreation;
    private Author author;

    public Book (String nameBook, int yearCreation, Author author){
        this.nameBook = nameBook;
        this.yearCreation = yearCreation;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }


    public int getYearCreation() {
        return yearCreation;
    }

    public void setYearCreation(int yearCreation) {
        this.yearCreation = yearCreation;
    }

    public Author getAuthor() {
        return author;
    }
}
