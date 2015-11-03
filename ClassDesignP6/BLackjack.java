import javax.swing.JOptionPane;
import java.util.Random;
public class BLackjack
{
    
    private String rank, suit;
    
    String[] ranks= { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String[] suits= {"clubs","spade","diamonds","hearts"};
    String Card;
     
    int randomslotranks = new Random().nextInt(13);
    int randomslotsuits= new Random().nextInt(4);
    
    public BLackjack()
    {
        this.rank=ranks[randomslotranks];
        this.suit=suits[randomslotsuits];
        this.Card=rank+suit;
    }
   
    public String toString()
    {
        String output = String.format("card1: %s %s \n"+
        "card1: %s %s \n"+
        "card1: %s %s \n"+
        "card1: %s %s \n"+"card1: %s %s \n"+, rank, suit);
        
        return output;
    }
}

/*
Create 6 Arrays of 2 RANDOM cards each; one of these arrays will represent the dealer, the other 5 will represent players.
The rules of blackjack are as follows:
cards with rank 2-10  are worth their face values
Jack, King and Queen (face cards) are worth 10
Aces are worth 11 or 1
Each player gets 2 cards. The dealer gets 2 cards
The total score of each player and the dealer is calculated
If a player’s score is greater than the dealer’s, the player wins
If a player’s score is less than or equal to the dealer’s, the dealer wins
If a player gets blackjack (a score of 21, i.e. a 10 or a face card and an ace) they win, even if the dealer also gets blackjack.
Calculate the scores for all players and the dealer.
Determine which players beat the dealer and which players were beaten.
Display each hand and a summary of the results of the game.
*/