package com.company;

public class Main {

    public static void main(String[] args) {

        Author lev = new Author("Lev", "Tolstoy");
        Author vladimir = new Author("Vladimir", "Lenin");

        Book nameBook1 = new Book("Война и мир", 1863,lev);
        nameBook1.setYearCreation(1872);
        Book nameBook2 = new Book("Что делать?", 1899,vladimir);
 //       System.out.println(nameBook1);
//        System.out.println(vladimir.nameAutor + " " + vladimir.surnameAutor);
//
//        System.out.println(nameBook1.nameBook + " " + nameBook1.yearCreation);


        String finBook1 = nameBook1.getAuthor().getNameAutor() + " " + nameBook1.getAuthor().getSurnameAutor() + " " + nameBook1.getNameBook() + " " + nameBook1.getYearCreation();
        String finBook2 = nameBook2.getAuthor().getNameAutor() + " " + nameBook2.getAuthor().getSurnameAutor() + " " + nameBook2.getNameBook() + " " + nameBook2.getYearCreation();
        System.out.println("Книга первая: " + finBook1);
        System.out.println("Книга вторая: " + finBook2);
    }
}


