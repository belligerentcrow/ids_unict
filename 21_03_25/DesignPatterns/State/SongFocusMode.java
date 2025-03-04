//ConcreteStateB
public class SongFocusMode implements MyDisplay{
    private SongLibrary songlib;
    private String modeTitle = "SongFocusMode";

    public SongFocusMode(SongLibrary sl){
        this.songlib = sl;
    }
    public void visualizza(Song s){
        System.out.println("Playing : " + (songlib.getWhereInList()+1) + " -- " + s);
    }

    public String getModeTitle() {
        return modeTitle;
    }
}