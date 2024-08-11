package com.example;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class LibraryManagement 
{
    public HashMap<String,Book>book=new HashMap<>();
    public String addBook(String ISBN,String title,String author,Integer publishYear){
        
        if (ISBN.isEmpty()) {
            return "You have not entered ISBN number";
        }
        if(title.isEmpty()){
            return "You have not entered title";
        }
        if(author.isEmpty()){
            return "You have not entered author name";
        }
        if(publishYear==null){
            return "You have not entered publishing year";
        }
        String remove=ISBN.replaceFirst("-","").replaceAll(" ","");//removing - and space

        if(remove.length()!=10 && remove.length()!=13){
            return "Invalid ISBN NUmber";
        }
        if(book.containsKey(ISBN)){//checking duplicate entry
            return "This book already exists";
        }
        
        Book newBook=new Book(ISBN, title, author, publishYear);
        book.put(ISBN,newBook);
        return "Book added: Book{ISBN='" + ISBN + "',title='" + title + "',author='" + author + "',publishYear=" + publishYear + "}";

        

    }
    
    public static void main( String[] args )
    {
    
       LibraryManagement management=new LibraryManagement();
        
    }
}
