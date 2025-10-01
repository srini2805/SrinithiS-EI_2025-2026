# Iterator Design Pattern - Playlist Example

## Overview
This project demonstrates the **Iterator Design Pattern** in Java.  
The Iterator Pattern provides a way to access elements of a collection (sequentially) without exposing the underlying implementation.

## Classes and Responsibilities

1. **Song.java**  
   - Represents a single song with a name.

2. **SongIterator.java**  
   - Interface defining `hasNext()` and `next()` methods for iteration.

3. **Playlist.java**  
   - Maintains a list of Song objects.  
   - Provides a `createIterator()` method returning a SongIterator.  
   - Contains a private inner class `PlaylistIterator` implementing the iterator.

4. **Main.java**  
   - Demonstrates how to use the Playlist and iterate through songs using the Iterator.

## How to Compile & Run

1. Open a terminal inside the `IteratorPattern` folder.

2. Compile all classes:

```bash
javac src/*.java Main.java
````

3. Run the program:

```bash
java Main
```

## Expected Output

```
Playing: Song A
Playing: Song B
Playing: Song C
```

## Key Points

* The **PlaylistIterator** is private, encapsulating iteration logic.
* **SongIterator** is public, allowing external clients to iterate without knowing the internal structure of Playlist.
* Follows the **Iterator Design Pattern** principle: decouple collection from iteration logic.


