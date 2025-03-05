//ConcreteStateA

public class FullPlaylistMode implements MyDisplay{
       private SongLibrary songlib;
       private String modeTitle = "FullPlaylist";

       public FullPlaylistMode(SongLibrary sl){
              this.songlib = sl;

       }

       public void visualizza(Song s){
              System.out.println("Printing library...");
              printAllList();
              System.out.println(songlib.getWhereInList()+1 + " ------ " +s);
              System.out.println("-----\n");
       }

       public String getModeTitle() {
           return modeTitle;
       }

       private void printAllList(){
              int i = 1;
              System.out.println("-----");
              for (Song song : songlib.getMyLibrary()){
                     System.out.println(i + " -- " + song);
                     i++;
              }
              System.out.println("-----");

       }
}