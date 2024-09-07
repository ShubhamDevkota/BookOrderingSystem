package models;

import java.util.List;

public class Books {

    String name;
    String author;
    Genre genre;
    String discription;
    int price;
    boolean Indiscount;

    //Constructor


    public Books(String name, String author, Genre genre, String discription, int price, boolean indiscount) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.discription = discription;
        this.price = price;
        Indiscount = indiscount;
    }

    //Getter Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isIndiscount() {
        return Indiscount;
    }

    public void setIndiscount(boolean indiscount) {
        Indiscount = indiscount;
    }

    // Getting all details
    public List<Books> getBookDetails(){
        System.out.println("Name of the book is (" + this.name + ") Written by "+this.author );
        System.out.println("Genre of the book is " + this.genre.name + " Description of the book is " + this.discription);
        System.out.println("Price of the book is " + this.price);
        if(Indiscount){
            System.out.print("Book is in discount");
        }
        else{
            System.out.print("Book is not in discount");
        }
        return null;
    }
}
