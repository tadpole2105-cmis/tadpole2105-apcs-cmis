import javax.swing.JOptionPane;
public class Card
{

       
    private String ranks, suits;

    public card1(String ranks, String suits)
    {
        this.ranks=ranks;
        this.suits=suits;
    }
   
     public card2(String ranks, String suits)
    {
        this.ranks=ranks;
        this.suits=suits;
    }
    
     public card3(String ranks, String suits)
    {
        this.ranks=ranks;
        this.suits=suits;
    }
    
    
    public String toString()
    {
        String output = String.format("card1%s\n"+
                                       "card3%s\n"+
                                       "card2%s\n", card1, card2, card3);
        
        return output;
    }
}