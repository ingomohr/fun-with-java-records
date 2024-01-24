# fun-with-java-records
Some sample stuff basically for showcasing and learning things around Java records

# Links
"Records In Java - Full Tutorial - The Best New Java Feature You're Not Using"
* https://youtu.be/gJ9DYC-jswo
* John Marty, Coding with John

# Q&A
## Why are Records Immutable?
Technically: Because each record extends class `java.lang.Record`, and Java doesn't have multiple inheritance.

By Design: Records are designed that way.

### Some Benefits of Immutability
- **Simplicity and Safety** (objects that don't change can reduce complexity and potential errors)
- **Thread Safety** (since they don't change)
- **Hashing Consistency** (can be used as keys in hash structures)
- **Data Transfer Object (DTO)** (can be used to be sent around - ensures integrity)





