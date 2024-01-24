package org.ingomohr.records;

public record BookRecord(String title, int id) {

    // this "virtually" creates
    // - a canonical constructor
    // - final fields
    // - getters (without "get" prefix)
    // - equals, hashCode, toString
    // - 2 records are equal if all their components are equal

    // What's also possible
    // - add more constructors
    // - add instance methods
    // - add static methods
    // - add static fields

    // overriding the canonical constructor w/ input validation
/*     public BookRecord(String title, int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id cannot be negative: " + id);
        }
        this.title = title;
        this.id = id;
    }
 */
    // if we want to modify the canonical constructor, we can use a compact constructor, too
    public BookRecord {
        if (id < 0) {
            throw new IllegalArgumentException("Id cannot be negative: " + id);
        }
    }


}
