    import javax.swing.JOptionPane;
public class MySong
{
    //create instance variable
    private String name;
    private String category;
    private int length;
    private int yearReleased;
    
    private String newlength;

   String password = JOptionPane.showInputDialog ("please enter password"); //pass is 1234
   
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
       if (password.equals("1234"))
       {
           this.yearReleased=yearreleased;
       }
       else
       {
       }
        
    }
    
     public String convertLength()
    {
        newlength= (Integer.toString(length/60)) + " minutes " + (Integer.toString(length%60)) + " seconds.";
        return newlength;
    }

   
    
    public String toString()
    {
        String output = new String();
        output = "Song's name is " + name + "\n" +
                 "Category : " + category + "\n" +
                 "length (in minutes): " + length +"\n" +
                 "year released:" + yearReleased;
        return output;
    }
}//end class MySOng