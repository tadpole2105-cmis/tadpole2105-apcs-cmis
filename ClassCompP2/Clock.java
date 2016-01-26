import javax.swing.JOptionPane;
public class Clock
{
    

    private int hour ;
    private int minutes ;
    private int seconds ;
     
    
     
    public Clock(int hour, int minutes, int seconds)
    {
        this.hour=hour;
        this.minutes=minutes;
        this.seconds=seconds;
    }//end constructor
     public int totalSeconds()
    {
        int totalsecs=0;
        totalsecs+= (hour*3600)+(minutes*60)+seconds;
        return totalsecs;
    }
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