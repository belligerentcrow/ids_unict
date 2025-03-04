
// Context 
public class MusicPlayer{
    private SongLibrary musiclibr;
    private MyDisplay displayState;
    private boolean isFocus;

    public MusicPlayer(SongLibrary musiclib){
        this.musiclibr = musiclib;
        isFocus = false;
        displayState = new FullPlaylistMode(musiclib);
        
    }

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
            //displayState.visualizza(musiclibr.getCurrentSong().get());
        }else{
            System.out.println("........");
        }
    }

    public void prevSong(){
        if(musiclibr.previous().isPresent()){
            //displayState.visualizza(musiclibr.getCurrentSong().get());
        }else{
            System.out.println("........");
        }
    }

    public void modeSongFocus(){

    }
    public void modePlayList(){

    }
}