
public class ClockStore
{
    //private  ArrayList<String> ClockInStock = new ArrayList<String>();
    Clock[] ClockInStock= new Clock [3];
    private int hour ;
    private int minutes ;
    private int seconds ;
    public ClockStore()
    {
        ClockInStock[0] = new Clock( 12, 30, 45 );
        ClockInStock[1] = new Clock( 12, 30, 44 );
        ClockInStock[2] = new Clock( 12, 30, 46 );
    
    }
   
    public int mostSeconds()
    {
        int index=0;
        for (int i=0; i< ClockInStock.length-1; i++)
        {
            if (ClockInStock[i].totalSeconds()>ClockInStock[i+1].totalSeconds())
            {
                index=i;
            }
        }
        return index;
    }
    
     public String toString()
        {
        
        String output = new String();
        output += "most second clock " + mostSeconds() + "\n";
        for (Clock clock: ClockInStock)
        {
            output += clock +"\n " ;
        }
        return output;
        }
}
