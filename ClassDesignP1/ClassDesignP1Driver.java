public class ClassDesignP1Driver
{
    public static void main(String[] args)
    {
        MySong song1=new MySong1(); //MySong is a new object unlike string or int
        MySong song2=new MySong2(); //gives the speifications of MySong2 to song2
        System.out.print(song1 + "\n" + song2);
    }//end method main
}
