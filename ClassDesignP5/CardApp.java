import java.util.Random;
public class CardApp
{
    public static void main(String[] args)
    {
        int[] myCards = new int[3];
       String[] ranks= { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
       String[] suits= {"clubs","spade","diamonds","hearts"};
       String ranks1,suits1,card1, ranks2, suits2, card2, ranks3, suits3, card3;
       
       
       
       for ( int i = 0; i < 3; i++ )
       {
           int randomslotranks = new Random().nextInt(ranks.length);
           int randomslotsuits= new Random().nextInt(suits.length);

           
           
           //for card1
        ranks1=ranks[randomslotranks];//pick a ramdon slot from ranks array
        suits1=suits[randomslotsuits];
        card1= ranks1 + suits1;
            //for card2
        ranks2=ranks[randomslotranks];
        suits2=suits[randomslotsuits];
        card2=ranks2 + suits2;
            //for card3
        ranks3=ranks[randomslotranks];
        suits3=suits[randomslotsuits];
        card3=ranks3+suits3;
        
        
        //myCards[i]= 
       }

       
       System.out.print();
    }//end method main
}
