# fun-with-java-records
Some sample stuff basically for showcasing and learning things around Java records

# Links
"Records In Java - Full Tutorial - The Best New Java Feature You're Not Using"
* https://youtu.be/gJ9DYC-jswo
* John Marty, Coding with John

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

## Can I extend my Record?
No. Every record is automatically `final` - whether or not you add the keyword.







