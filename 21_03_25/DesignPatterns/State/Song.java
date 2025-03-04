public class Song {
    private String title;
    private String author;
    private int secondsDuration;
    
    public Song(String t, String au, int durat){
        this.title = t;
        this.author = au;
        this.secondsDuration = durat;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getSecondsDuration() {
        return secondsDuration;
    }
}
