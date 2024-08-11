package com.example;

public class Book{
    private String ISBN;
    private String title;
    private String author;
    private Integer publishYear;

    public Book(String ISBN,String title,String author,Integer publishYear){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
        this.publishYear=publishYear;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }

    public String getTitle(){
        return title;
    }
    public void settitle(String title){
        this.title=title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }





    
}