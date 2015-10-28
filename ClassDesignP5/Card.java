import javax.swing.JOptionPane;
import java.util.Random;
public class Card
{

    private String rank, suit;
    String[] ranks= { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String[] suits= {"clubs","spade","diamonds","hearts"};
    String Card;
               
    int randomslotranks = new Random().nextInt(ranks.length);
    int randomslotsuits= new Random().nextInt(suits.length);

       
    public Card()
    {
        this.rank=ranks[randomslotranks];
        this.suit=suits[randomslotsuits];
    }
   
    
    
    public String toString()
    {
        String output = String.format("card: %s %s \n", rank, suit);
        
        return output;
    }
}