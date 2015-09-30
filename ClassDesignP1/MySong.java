public class MySong
{
    //create instance variable
    private String name;
    private String catagory;
    private double length;//in mins
    //constructors to initialize instance variables
    
    public MySong()
    {
        name= new String ("Watermelon Man");
        category= new String("Jazz");
        length= 5.32;
    }//end constructor
    
    public MySong(String name, String category, double length)
    {
        name= name;
        category= category;
        length= length;
    }//end constructor
    
    public String toString()
    {
        String output = new String();
        output = "Song's name is " + name + "\n" +
                 "Category : " + category + "\n" +
                 "length: " + length;
        return output;
    }
}//end class MySOng