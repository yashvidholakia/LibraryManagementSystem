package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LibraryManagementTest 
{
    /**
     * Rigorous Test :-)
     */
    private LibraryManagement management;

    @Before
    public void setUp(){
        management=new LibraryManagement();
    }

    @Test
    public void testEmptyISBNValue(){
        String val=management.addBook(" ","The 5 AM Club","Robin Sharma",1998);
        assertEquals("Invalid ISBN NUmber",val);//checking empty value
    }
    @Test
    public void testInvalidISBNNumber(){
        String val=management.addBook("1234567","The 5 Am club","Robin Sharma",1999);
        assertEquals("Invalid ISBN NUmber",val);//checking length it is should be 10 or 13(10 for old books and 13 for modern book)
    }
    
    @Test
    public void testEmptyTitlevalue(){
        String val=management.addBook("1234567891234","","Robin Sharma", 1998);
        assertEquals("You have not entered title",val);//checking empty value
    }
    @Test
    public void testEmptyAuthorvalue(){
        String val=management.addBook("1234567891234","The 5 am club","", 1998);
        assertEquals("You have not entered author name",val);//checking empty value
    }
    @Test
    public void testEmptyPublishyearvalue(){
        String val=management.addBook("1234567891234","The 5 am club","Robin Sharma",null);
        assertEquals("You have not entered publishing year",val);//checking empty value
    }
    @Test
    public void testAddBooks(){
        String expected = "Book added: Book{ISBN='2345678912',title='Rich Dad Poor Dad',author='Robert Kiyosaki',publishYear=1997}";
        String val = management.addBook("2345678912", "Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        assertEquals(expected,val);
    }
    @Test
    public void checkDuplicateEntryOfBook(){

        String val1 = management.addBook("2345678912", "Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        assertEquals("Book added: Book{ISBN='2345678912',title='Rich Dad Poor Dad',author='Robert Kiyosaki',publishYear=1997}", val1);
    
        // adding the same book again
        String val2 = management.addBook("2345678912", "Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        assertEquals("This book already exists", val2);
    }
}
