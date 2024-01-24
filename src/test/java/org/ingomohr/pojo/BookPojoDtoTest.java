package org.ingomohr.pojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookPojoDtoTest {

    private static final String FILE_NAME_SER = "xObjectSer.txt";

    @BeforeEach
    void createSerializedItem() {
        BookPojo book = new BookPojo("My Title", 42);
        serialize(book);
    }

    @Test
    void deserialization_InvalidValue_ValidiationInConstructorWasCalled() {

        BookPojo book = deserizalize();
        System.out.println("========");
        System.out.println(book);
        System.out.println("========");

        assertEquals("My Title", book.getTitle());
        assertEquals(42, book.getId());
    }

    void serialize(BookPojo book) {
        try (FileOutputStream fileOut = new FileOutputStream(FILE_NAME_SER);
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(book);
            System.out.println("Serialized data is saved in xObject.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    BookPojo deserizalize() {
        BookPojo book;

        try (FileInputStream fileIn = new FileInputStream(FILE_NAME_SER);
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            book = (BookPojo) in.readObject();
            System.out.println("Deserialized object: " + book);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return book;
    }

}
