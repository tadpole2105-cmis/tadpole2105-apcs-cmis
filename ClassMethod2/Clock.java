
import javax.swing.JOptionPane;
public class Clock
{
    

    private int hour ;
    private int minutes ;
    private int seconds ;
    private int totalsecs;
    
     
    public Clock(int hour, int minutes, int seconds)
    {
        this.hour=Integer.parseInt(JOptionPane.showInputDialog("enter the hour"));
        this.minutes=  Integer.parseInt(JOptionPane.showInputDialog("enter the minutes"));
       
    }//end constructor
    
    
    public void setTime(String hour, String minutes, String seconds)
    {
        this.hour= "0" + (String) (hour);
        this.minutes= "0" + (String) (minutes);
        this.seconds="0" +(String)(seconds);
    }
    
    public int calcsecs()
    {
        totalsecs= (hour*3600) + (minutes*60) + seconds;
        return totalsecs;
    }
   
    public void convertDaylightSaving( int savingsHour)//void because it's a setter method
    {
        this.hour+=savingsHour;
        
    }
    
    public String toString()
    {
        String output = "The time is " + hour + ": " + minutes + ": " + seconds + "\n"
                  + "which is : " + calcsecs() +"seconds in total " + "\n";
        return output;
    }
}//end class MySOng


/*
a public “setter” method called setTime() should be written that takes three integer parameters to set the Clock’s hours, minutes, and seconds, respectively,
a public method convertDaylightSaving( int hours ) that increments or decrements the hours of the Clock by the number specified by the parameter hours. The parameter hours will essentially be “1” or “-1” depending on whether we are “Springing forward” or “Falling back.” Don’t worry about “noon” and “midnight” conditions; this will be in a future upgrade.
a public method totalSeconds() that returns the total number of integer seconds represented the numbers of hours, minutes and seconds on the Clock. For example, the method should return “3661” if the Clocks reads “1 hour, 1 minute, and 1 second”. Note that no separate totalSeconds private instance variable should be included in this class. The method totalSeconds() can return a value that can be “calculated” at any time from the existing hours, minutes, and seconds private instance variables.
upgrade the toString() method so that it also returns the total seconds in a user-friendly format. Write a driver class to test the setTime(), convertDaylightSavings(int hours), and totalSeconds() methods. The driver should perform the following actions:
Create an instance of a Clock object,
Print the Clock using its toString() method,
Use the setTime() method to set the Clock’s time to a non-zero time
Print the Clock again using its toString() method,
Use the convertDaylightSaving( int hours ) method to adjust the time of the Clock by the hours parameter,
Print the Clock again using its toString() method.
*/