package com.company;

import java.util.Objects;

public class Author {
    private String nameAutor;
    private String surnameAutor;

    public Author(String nameAutor, String surnameAutor){
        this.nameAutor = nameAutor;
        this.surnameAutor = surnameAutor;
    }

    public String getNameAutor() {
        return nameAutor;
    }


    public String getSurnameAutor() {
        return surnameAutor;
    }


    @Override
    public String toString() {
        return nameAutor + " " + surnameAutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameAutor.equals(author.nameAutor) && surnameAutor.equals(author.surnameAutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAutor, surnameAutor);
    }
}

