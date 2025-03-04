# MusicPlayer - State

This software simulates the operation of a music player - and implements the Design Pattern State in visualizing how the playlist is shown to the user.  
  
The Song class and the SongLibrary class act as aid for the MusicPlayer.  
  
The Song class defines the objects which represent the songs; the class Song has three attributes: `String title`, `String author` and `int secondsDuration`. It contains getter methods, and a `String toString()` Override in order to print the details of the song.  
  
The SongLibrary class has two private attributes: `List<Song> myLibrary` contains the songs inside the playlist, and `int whereInList` represents the "head" of SongLibrary playlist, the current song which is "selected" by the playlist.  
  
The SongLibrary's method `public Optional<Song> next()` checks and then if it is possible to get a next, it returns it (or the absence of it) through an `Optional<Song>` object through which an object Song can be accessed through the `.get()` method implemented in the Optional library. The same is done by the `public Optional<Song> previous()` method, but for the previous song. Both methods work in a "circular" way, looping back to the end if one goes before the first, and going up to the beginning if one tries to go after the last Song in the list.  
  
*It is to be noted that currently, both the next() and the previous() methods do not respect the Command and Query paradigm, as they both interact with objects and return values.*
  
The `public void addSong(Song s)` adds a song to the `List<Song> myLibrary` list, and `public void removeCurrentSong()` removes the selected song in said List, if the List is not empty.  

The method `public Optional<Song> getCurrentSong()` works in a similar way as the `next()` and the `prev()`. It checks if the List MyLibrary is empty. If it is not, then it returns an Optional object which contains the current song, which is at the index given by the int `whereInList`. If the list is empty, then this method returns an empty Optional.  
  
// TO-DO : practice with streams by adding more songs.