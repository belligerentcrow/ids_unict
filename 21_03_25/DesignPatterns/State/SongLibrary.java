import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SongLibrary {
    private List<Song> myLibrary;
    private int numOfSongs;
    private int whereInList;


    
    public SongLibrary() {
        myLibrary = new ArrayList<>();
        whereInList = 0;
    }

    public Optional<Song> next(){
        if(!(myLibrary.isEmpty())&& whereInList < myLibrary.size()-1){
            whereInList++;
            return Optional.of(myLibrary.get(whereInList));
        }
        else if (myLibrary.isEmpty()){
            System.out.println("Can't show next. No songs in playlist");
            return Optional.empty();
        }
        else{
            System.out.println("Last song in list. Returning to first");
            whereInList = 0;
            return Optional.of(myLibrary.get(whereInList));
        }
    }

    public Optional<Song> previous(){
        if(!(myLibrary.isEmpty()) && whereInList>0){
            whereInList--;
            return Optional.of(myLibrary.get(whereInList));
        }else if(myLibrary.isEmpty()){
            System.out.println("Can't show previous. No songs in list.");
            return Optional.empty();
        }else{
            whereInList = myLibrary.size()-1;
            System.out.println("First song in list. Returning to last song.");
            return Optional.of(myLibrary.get(whereInList));
        }
    }

    public boolean isEmpty(){
        return myLibrary.isEmpty();
    }

    public List<Song> getMyLibrary() {
        return myLibrary;
    }
    public void addSong(Song s){
        myLibrary.add(s);
        numOfSongs++;
        System.out.println("Song "+ s.getTitle() + " by " + s.getAuthor() + " added to library.");
    }

    public void removeCurrentSong(){
        if(!(myLibrary.isEmpty())){
            --numOfSongs;
            myLibrary.remove(whereInList);
        }else
            System.out.println("No songs to remove.");
    }


    public Optional<Song> getCurrentSong(){
        if(!(myLibrary.isEmpty())){
            return Optional.of(myLibrary.get(whereInList));
        } else {
            System.out.println("Can't get current song. No songs in list");
            return Optional.empty();
        }
    }

    public int getWhereInList() {
        return whereInList;
    }
}
