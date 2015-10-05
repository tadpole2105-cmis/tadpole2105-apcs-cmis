import javax.swing.JOptionPane;
public class Clock
{
    

    private int hour ;
    private int minutes ;
    private int seconds ;
    = Integer.parseInt(JOptionPane.showInputDialog("enter the second"));
    = Integer.parseInt(JOptionPane.showInputDialog("enter the hour"));
    = Integer.parseInt(JOptionPane.showInputDialog("enter the minutes"));
    public Clock(int hour, int minutes, int seconds)
    {
        this.hour= hour; //the dirver will give info to this  
        this.minutes= minutes;
        this.seconds= seconds;
    }//end constructor
    
    public Clock()
    {
       
    }//end userinout constructor 
    
    public String toString()
    {
        String output = new String();
        output = "The time is " + hour + ": " + minutes + ": " + seconds;
        return output;
    }
}//end class MySOng