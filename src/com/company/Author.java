package com.company;

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
}
