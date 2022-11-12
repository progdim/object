package com.company;

import java.util.Objects;

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

    @Override
    public String toString() {
        return nameBook + " " + author.toString() + " " + yearCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearCreation == book.yearCreation && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearCreation, author);
    }
}
