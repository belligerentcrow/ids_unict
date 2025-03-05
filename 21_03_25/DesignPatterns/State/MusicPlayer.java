
/** Context class */ 
public class MusicPlayer{
    
    private SongLibrary musiclibr;
    private MyDisplay displayState;
    private boolean isFocus;

    public MusicPlayer(SongLibrary musiclib){
        this.musiclibr = musiclib;
        isFocus = false;
        displayState = new FullPlaylistMode(musiclib);
    }

    /** SwitchMode allows the Client to switch the status, by changing the
     * instance of the `private MyDisplay displayState` attribute.
     * The attribute `private boolean isFocus` currently holds the value of the 
     * status that is contained in MusicPlayer. The default can be set
     * in the MusicPlayer constructor. At time of writing it's false - 
     * thus, FullPlaylistMode is the "default" instance.  
     * 
    */
    public void switchMode(){
        if(this.isFocus){
            displayState = new FullPlaylistMode(this.musiclibr);
            isFocus = false;
        }else{
            displayState = new SongFocusMode(musiclibr);
            isFocus = true;
        }
        System.out.println("Switching to... " + displayState.getModeTitle());
    }


    public void playMusic(){
        if(musiclibr.getCurrentSong().isPresent()){
            displayState.visualizza(musiclibr.getCurrentSong().get());
        }else{
            System.out.println("........");
        }
    }

    public void nextSong(){
        if(musiclibr.next().isPresent()){

        }else{
            System.out.println("........");
        }
    }

    public void prevSong(){
        if(musiclibr.previous().isPresent()){

        }else{
            System.out.println("........");
        }
    }

}