public class ClassDesignP1Driver
{
    public static void main(String[] args)
    {
        SongInfo song1=new SongInfo(); //MySong is a new object unlike string or int
        SongInfo song2=new SongInfo("Circle of Life", "Unknown", 6.00); //gives the speifications of MySong2 to song2
        System.out.print(song1 + "\n"+ "........................." + "\n" + song2);
    }//end method main
}
