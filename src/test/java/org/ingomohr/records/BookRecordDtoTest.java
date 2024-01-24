package org.ingomohr.records;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookRecordDtoTest {

    private static final String FILE_NAME_SER = "xObjectRecord.ser";

    // @BeforeEach
    void createSerializedItem() {
        BookRecord book = new BookRecord("My Title", 42);
        serialize(book);
    }

    @Test
    void deserialization_InvalidValue_WhatHappensNow() {

        BookRecord book = deserizalize();
        System.out.println("========");
        System.out.println(book);
        System.out.println("========");

        assertEquals("My Title", book.title());
        assertEquals(42, book.id());
    }

    void serialize(BookRecord book) {
        try (FileOutputStream fileOut = new FileOutputStream(FILE_NAME_SER);
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(book);
            System.out.println("Serialized data is saved in xObject.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    BookRecord deserizalize() {
        BookRecord book;

        try (FileInputStream fileIn = new FileInputStream(FILE_NAME_SER);
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            book = (BookRecord) in.readObject();
            System.out.println("Deserialized object: " + book);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return book;
    }

}
