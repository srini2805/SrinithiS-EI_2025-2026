Overview: 
This project demonstrates the **Iterator Design Pattern** in Java. 
The Iterator Pattern provides a way to access elements of a collection 
(sequentially) without exposing the underlying implementation.

Classes and Responsibilities

1. Song.java
   - Represents a single song with a name.

2. SongIterator.java
   - Interface defining `hasNext()` and `next()` methods for iteration.

3. Playlist.java
   - Maintains a list of Song objects.
   - Provides a `createIterator()` method returning a SongIterator.
   - Contains a private inner class `PlaylistIterator` implementing the iterator.

4. Main.java
   - Demonstrates how to use the Playlist and iterate through songs using the Iterator.

How to Compile & Run
--------------------
1. Open a terminal inside the 'IteratorPattern' Folder

2. Compile all classes:
   javac src/*.java Main.java

3. Run the program:
   java Main




