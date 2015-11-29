public class ClockDriver
{
    public static void main(String[] args)
    {
        Clock clockUser1= new Clock(0,0,0);
        System.out.println( clockUser1);
        clockUser1.convertDaylightSaving(1); //what goes inside () is the arg 
        System.out.println( clockUser1);
        
        
        
        Clock clockUser2= new Clock(0,0,0); 
        clockUser2.setTime(3,3,3);//call method setTIme to set new time for clockuser2, the num in arg will replace the second joptionpain 
        System.out.println( clockUser2);//after replacing print clock2
        clockUser2.convertDaylightSaving(1); //what goes inside () is the arg 
        System.out.println( clockUser2);
    }//end method main
}
