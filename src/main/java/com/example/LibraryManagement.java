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
        
        while(true){
    
            LibraryManagement management=new LibraryManagement();
            Scanner scan=new Scanner(System.in);
            System.out.println("1).Add Book");
            System.out.println("2).Borrow Book");
            System.out.println("3).Return Book");
            System.out.println("4).View Available Book");
            System.out.println("5).Exit");
            System.out.println("Enter your Choice");
            int value=scan.nextInt();
            scan.nextLine();
       

        switch(value){
            case 1:
                System.out.println("Enter ISBN Number");
                String ISBN=scan.nextLine();
                System.out.println("Enter Title of Book");
                String title=scan.nextLine();
                System.out.println("Enter Author name");
                String author=scan.nextLine();
                System.out.println("Enter Published Year");
                int publishYear=scan.nextInt();
                scan.nextLine();
                management.addBook(ISBN, title, author, publishYear);
                break;
                default:
                    System.out.println("Invalid input");


                }

       }
       
        
    }
}
