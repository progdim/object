package com.company;

public class Book {
    private String nameBook;
    private int yearCreation;

    public Book (String nameBook, int yearCreation){
        this.nameBook = nameBook;
        this.yearCreation = yearCreation;
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
}
