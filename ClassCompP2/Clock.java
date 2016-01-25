import javax.swing.JOptionPane;
public class Clock
{
    

    private int hour ;
    private int minutes ;
    private int seconds ;
     
    
     
    public Clock(int hour, int minutes, int seconds)
    {
        this.hour=Integer.parseInt(JOptionPane.showInputDialog("enter the hour"));
        this.minutes=  Integer.parseInt(JOptionPane.showInputDialog("enter the minutes"));
        this.seconds=Integer.parseInt(JOptionPane.showInputDialog("enter the seconds"));
    }//end constructor
    
    public Clock()
    {
       hour=21;
       minutes=32;
       seconds=43;
    }//end userinout constructor 
    
    public String toString()
    {
        String output = new String();
        output = "The time is " + hour + ": " + minutes + ": " + seconds ;
        return output;
    }
}//end class MySOng