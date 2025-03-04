public class ClientListener {
    
    public static void main(String[] args) {
        Song song1 = new Song("Don't Stop Me Now", "Queen", 5*60);
        Song song2 = new Song("Doctor Who Opening 8 Season", "Murray Gold", 60);
        SongLibrary myLibrary = new SongLibrary();
        myLibrary.addSong(song1);
        myLibrary.addSong(song2);

        
    }
}
