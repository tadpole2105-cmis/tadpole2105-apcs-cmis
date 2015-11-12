public class MySong
{
    //create instance variable
    private String name;
    private String category;
    private int length;
    private int yearReleased;
    private String newlength;
    

    
    public MySong( String name, String category, int length, int yearReleased)
    {
        this.name= name;
        this.category= category;
        this.length= length; 
        this.yearReleased= yearReleased;
    }
    
    
    public int getYearReleased()
    {
        return   yearReleased;
    }
    public void setYearReleased(int yearreleased)
    {
       
        this.yearReleased=yearreleased;
    }
    
    
    public String ConvertLength()
    {
        
        newlength=new String(length/60 + length%60);
        return newlength; //divide length by 60, mod length by 60
    }
    
    
    
    public String toString()
    {
        String output = new String();
        output = "Song's name is " + name + "\n" +
                 "Category : " + category + "\n" +
                 "length: " + length +"\n" +
                 "year released:" + yearReleased;
        return output;
    }
}//end class MySOng