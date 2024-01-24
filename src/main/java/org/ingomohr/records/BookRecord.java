package org.ingomohr.records;

public record BookRecord(String title, int id) {

    // this "virtually" creates
    // - a canonical constructor
    // - final fields
    // - getters (without "get" prefix)
    // - equals, hashCode, toString
    // - 2 records are equal if all their components are equal

}
