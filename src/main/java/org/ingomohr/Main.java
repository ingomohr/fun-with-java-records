package org.ingomohr;

import org.ingomohr.pojo.BookPojo;
import org.ingomohr.records.BookRecord;

public class Main {
    public static void main(String[] args) {
        BookPojo bookPojo = new BookPojo("Lord of the Rings", 12345);
        System.out.println(bookPojo);

        var bookRecord = new BookRecord("The Wind in the Willows", 41);
        var newBook = bookRecord.withId(43);
        System.out.println(newBook);


    }
}