public class ClientListener {
    
    public static void main(String[] args) {
        Song song1 = new Song("Don't Stop Me Now", "Queen", 5*60);
        Song song2 = new Song("Doctor Who Opening 8 Season", "Murray Gold", 60);
        SongLibrary myLibrary = new SongLibrary();
        MusicPlayer vlc = new MusicPlayer(myLibrary);
        myLibrary.addSong(song1);
        myLibrary.addSong(song2);
        Song song3 = new Song("Smells Like Teen Spirit", "Nirvana", 3*60);
        myLibrary.addSong(song3);
        Song song4 = new Song("William Tell Overture", "Rossini", 8*60);
        myLibrary.addSong(song4);
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
