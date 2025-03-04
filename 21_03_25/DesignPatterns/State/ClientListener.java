public class ClientListener {
    
    public static void main(String[] args) {
        //Creating a SongLibrary and a MusicPlayer
        SongLibrary myLibrary = new SongLibrary();
        MusicPlayer vlc = new MusicPlayer(myLibrary);

        //creating two songs
        Song song1 = new Song("Don't Stop Me Now", "Queen", 5*60);
        Song song2 = new Song("Doctor Who Opening 8 Season", "Murray Gold", 60);

        //adding the songs to the instance of the library
        myLibrary.addSong(song1);
        myLibrary.addSong(song2);

        //creating two more songs
        Song song3 = new Song("Smells Like Teen Spirit", "Nirvana", 3*60);
        Song song4 = new Song("William Tell Overture", "Rossini", 8*60);
        Song song5 = new Song("Colgera's Theme", "Tears of the Kingdom Soundtrack", 3*60);

        //adding them to the library
        myLibrary.addSong(song3);
        myLibrary.addSong(song4);

        //using the "vlc" player
        vlc.playMusic();
        vlc.switchMode();
        vlc.nextSong();
        vlc.playMusic();
        vlc.switchMode();
        vlc.switchMode();

        vlc.nextSong();
        vlc.playMusic();

        vlc.nextSong();
        vlc.playMusic();

        vlc.nextSong();
        vlc.playMusic();

        vlc.prevSong();
        vlc.playMusic();

        vlc.switchMode();
        vlc.playMusic();
    }

    
    
}
