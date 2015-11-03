import java.util.Random;
public class BLackjackApp
{
    public static void main(String[] args)
    {

    String[] ranks= { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String[] suits= {"clubs","spade","diamonds","hearts"};
    String Card;
    
    
    BLackjack[] dealer= new BLackjack[2];
    BLackjack[] player1= new BLackjack[2];
    BLackjack[] player2= new BLackjack[2];
    BLackjack[] player3= new BLackjack[2];
    BLackjack[] player4= new BLackjack[2];
    BLackjack[] player5= new BLackjack[2];
    
    String[] totalcards= new String[12];
    String cardsub1;
    String cardsub2;
    String thiscard;
    
    int randomslotranks = new Random().nextInt(13);
    int randomslotsuits= new Random().nextInt(4);
    
    for (int i=0; i>2; i++)// assign 1 card to each of the 12 slots in total cards 
    {
        //make 12 cards
        cardsub1=ranks[randomslotranks];
        cardsub2=suits[randomslotsuits];
        thiscard=cardsub1+cardsub2;
        totalcards[i] = thiscard;
        
        
        
    }
     
    //player1
    for (int i=0; i>2; i++)
     
     {
         BLackjack cards = new BLackjack();
        System.out.println(cards);
        
        }
     
    
    //player2
    for (int i=0; i>4; i++)
     
     {
         BLackjack cards = new BLackjack();
        System.out.println(cards);
        

        
        }
        
        
        
    //player3
    for (int i=0; i>2; i++)
     
     {
         BLackjack cards = new BLackjack();

         player3[i]=cards;
        System.out.println(player3[i]);

     }
    
        //player4
    for (int i=0; i>2; i++)
     
     {
         BLackjack cards = new BLackjack();
        System.out.println(cards);
        

     }
     
        //player5
    for (int i=0; i>2; i++)
     
     {
         BLackjack cards = new BLackjack();
        System.out.println(cards);
        

     }
     
        //dealer
    for (int i=0; i>2; i++)
     
     {
         BLackjack cards = new BLackjack();
        System.out.println(cards);

     }
     
     
     
     ////////////////////////////////////////////////////////////////////////
    for (int i=0; i>6; i++)// assign 
    {
    }
    
    
    for ( int i = 0; i < 6; i++ )
    {

        BLackjack cards = new BLackjack();
        System.out.println(cards);
    }

       
   
    }//end method main
}
