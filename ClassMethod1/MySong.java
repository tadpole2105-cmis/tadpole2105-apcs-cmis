public class MySong
{
    //create instance variable
    private String name;
    private String category;
    private double length;
    private int yearReleased;
    
    public MySong()
    {
        name= new String ("Watermelon Man");
        category= new String("Jazz");
        length= 5.32;
     
    }
    
    public int GetYearReleased()
    {
        return   yearReleased;
    }
   
    public void setyearReleased(int yearReleased)
    {
        this.yearReleased=yearReleased;
    }
    
    
    
    
    
    public String toString()
    {
        String output = new String();
        output = "Song's name is " + name + "\n" +
                 "Category : " + category + "\n" +
                 "length: " + length;
        return output;
    }
}//end class MySOng