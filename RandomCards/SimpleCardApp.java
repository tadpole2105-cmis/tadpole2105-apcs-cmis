import javax.swing.JOptionPane;
import java.util.Random;
public class SimpleCardApp
{
   public static void main(String[] args)
    {
       
    
    String[] ranks= { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String[] suits= {"clubs","spade","diamonds","hearts"};
    String[] cards = new String[52];
    String[] thisranks=new String[2];
    String[] thissuits= new String[2];
    int i,s;
    String thissuit;
    //make suits loop repeat again and again???
    
    public SimpleCards()
    {
    for (i=0; i<12; i++)
    {
       // for (s=0; s<4; s++)
        //{
         //   thissuit=thissuits[s];
        //}
        cards[i]=ranks[i] + suits[1];

    }
       for (i=12; i<24; i++)
    {
       // for (s=0; s<4; s++)
        //{
         //   thissuit=thissuits[s];
        //}
        cards[i]=ranks[i] + suits[2];
        

    }
       
       for (i=24; i<36; i++)
    {
       // for (s=0; s<4; s++)
        //{
         //   thissuit=thissuits[s];
        //}
        cards[i]=ranks[i] + suits[2];
        

    }
       
       for (i=36; i<48; i++)
    {
       // for (s=0; s<4; s++)
        //{
         //   thissuit=thissuits[s];
        //}
        cards[i]=ranks[i] + suits[3];
        

    }
       
   }//end constructor
     }
   
    

}