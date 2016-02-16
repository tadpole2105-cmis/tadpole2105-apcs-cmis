
public class TeleDriver
{
    public static void main(String[] args)
    {
       Television[] alltele = new Television[4];
       alltele[0]= new LED("HD Bronze", 59.99);
       alltele[1]= new DLP("DLP Silver", 99.99);
       alltele[2]= new LCD("LED Platinum", 399.99);
       alltele[3]= new Plasma("Plasma Sapphire", 499.99);
    
       for ( Television tv: alltele )
        {
            System.out.println(tv + "\n");
        } 
    }
    
}
