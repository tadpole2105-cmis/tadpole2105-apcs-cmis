public class  MySongApp
{
    public static void main(String[] args)
    {
        MySong song1=new MySong("Watermelon Man", "Jazz", 455, 0); //MySong is a new object unlike string or int

        song1.getYearReleased();
        song1.setYearReleased(1994);


        System.out.print(song1 + "\n");
        
    }//end method main
}
