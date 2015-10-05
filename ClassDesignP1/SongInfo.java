public class SongInfo

{
    //create instance variable
    private String name;
    private String category;
    private double length;//in mins
    //constructors to initialize instance variables
    
    public SongInfo()
    {
        name= new String ("Watermelon Man");
        category= new String("Jazz");
        length= 5.32;
    }//end constructor
    
    public SongInfo(String name, String category, double length)
    {
        this.name= name; //the dirver will give info to this  
        this.category= category;
        this.length= length;
    }//end constructor
    
    public String toString()
    {
        String output = new String();
        output = "The song's name is " + name + "\n" +
                 "Category : " + category + "\n" +
                 "length: " + length;
        return output;
    }
}//end class MySOng