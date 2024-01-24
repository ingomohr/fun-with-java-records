# fun-with-java-records
Some sample stuff basically for showcasing and learning things around Java records

# Links
"Records In Java - Full Tutorial - The Best New Java Feature You're Not Using"
* https://youtu.be/gJ9DYC-jswo
* John Marty, Coding with John

"Records Patterns, Performance and Serialization - JEP Café #8"
* https://youtu.be/1oC9ESbyvqs
* José Paumard, JEP Café

# Q&A
## Why are Records Immutable?
Records are designed to be immutable.

### Some Benefits of Immutability
- **Simplicity and Safety** (objects that don't change can reduce complexity and potential errors)
- **Thread Safety** (since they don't change)
- **Hashing Consistency** (can be used as keys in hash structures)
- **Data Transfer Object (DTO)** (can be used to be sent around - ensures integrity)

## Can I make my Record Extend some other Class?
No. Each record extends class `java.lang.Record`, and Java doesn't have multiple inheritance.

## Can I have my Record implement an interface?
Yup.

## Can I extend my Record?
No. Every record is automatically `final` - whether or not you add the keyword.

## Can I override the canonical constructor?
Yup. Just declare it again with your own impl. Can be useful if you want to validate your input.

You can use a compact constructor, too:
```java
public BookRecord {
    if (id < 0) {
        throw new IllegalArgumentException("Id cannot be negative: " + id);
    }
}
```

This is effectively the same as this:
```java
public BookRecord(String title, int id) {
    if (id < 0) {
        throw new IllegalArgumentException("Id cannot be negative: " + id);
    }
    this.title = title;
    this.id = id;
}
```









