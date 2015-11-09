public class  MySongApp
{
    public static void main(String[] args)
    {
        MySong song1=new MySong(); //MySong is a new object unlike string or int
        
        System.out.print(song1 + "\n");
        
        MySong.GetYearReleased();
        MySong.setyearReleased(1994);
        
        
    }//end method main
}
