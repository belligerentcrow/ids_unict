import java.util.ArrayList;
import java.util.List;

public class SongLibrary {
    private List<Song> myLibrary;
    private int numOfSongs;
    private int whereInList;


    public SongLibrary() {
        myLibrary = new ArrayList<>();
        whereInList = 0;
    }

    public Song next() throws Exception{
        if(numOfSongs >0 && whereInList < numOfSongs){
            whereInList++;
            return myLibrary.get(whereInList);
        }
        else if (myLibrary.isEmpty()){
            throw new Exception("Can't show next. No songs in playlist");
        }
        else{
            System.out.println("Last song in list. Returning to first");
            whereInList = 0;
            return myLibrary.get(whereInList);
        }
    }

    public Song previous() throws Exception {
        if(numOfSongs>0 && whereInList>0){
            whereInList--;
            return myLibrary.get(whereInList);

        }else if(myLibrary.isEmpty()){
            throw new Exception("Can't show previous. No songs in list.");
        }else{
            whereInList = myLibrary.size()-1;
            System.out.println("First song in list. Showing last songs.");
            return myLibrary.get(whereInList);
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

    public void removeCurrentSong() throws Exception{
        myLibrary.remove(whereInList);
    }

    public Song getCurrentSong() throws Exception{
        if(!(myLibrary.isEmpty())){
            return myLibrary.get(whereInList);
        } else {
            throw new Exception("Can't get current song. No songs in list");
        }
    }
}
