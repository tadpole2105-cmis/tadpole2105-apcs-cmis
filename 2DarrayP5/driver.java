public class driver
{
    public static void main(String[] args)
    {
       
    
        Jukebox jukebox=new Jukebox(); 
        System.out.println(jukebox + "\n");
        System.out.println("random song" + jukebox.randomSong());
        System.out.println("all songs with 2 rating:  " + "\n" +jukebox.playSongofRating(2)  );
    }//end method main
}
