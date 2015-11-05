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
     
    
    //no need for for loop 
    //blackjack d = new blackjack ()
    
    int value1;
    int value2;
    
    //dealer
    for (int i=0; i<1; i++)
     
     {
        BLackjack cards = new BLackjack();
        
        //for rank1
        if (dealer[].rank1.equals("A")) // go look at rank1 for card 1 of dealer
        {
            value1=11;
        }
        else if (dealer[i].rank1.equals("K")) // go look at rank1 for dealer
        {
            value1=10;
        }
        else if (dealer[i].rank1.equals("Q")) // go look at rank1 for dealer
        {
            value1=10;
        }
        else if (dealer[i].rank1.equals("J")) // go look at rank1 for dealer
        {
            value1=10;
        }
        else  // go look at rank1 for dealer
        {
            int stringToInt=Integer.parseInt(dealer[i].rank1);//stringTOInt will be equal to what ever number rank1 has
            value1=stringToInt;
        }
        
        //for rank2        
        if (dealer[i].rank2.equals("A")) // go look at rank12 for dealer
        {
            value2=11;
        }
        else if (dealer[i].rank2.equals("K")) // go look at rank2 for dealer
        {
            value2=10;
        }
        else if (dealer[i].rank2.equals("Q")) // go look at rank1 for dealer
        {
            value2=10;
        }
        else if (dealer[i].rank2.equals("J")) // go look at rank1 for dealer
        {
            value2=10;
        }
        else  // will take care of the rest of the items which are numbers
        {
            int stringToInt=Integer.parseInt(dealer[i].rank2);//stringTOInt will be equal to what ever number rank1 has
            value2=stringToInt;
        }
        int totalvaluedealer= value1+value2;
        System.out.println(totalvaluedealer);
        
    }
     
       
    //player1    
    for (int i=0; i<1; i++)
    {
        if (player1[i].rank1.equals("A")) 
        {
            value1=11;
        }
        else if (player1[i].rank1.equals("K")) 
        {
            value1=10;
        }
        else if (player1[i].rank1.equals("Q")) 
        {
            value1=10;
        }
        else if (player1[i].rank1.equals("J")) 
        {
            value1=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(dealer[i].rank1);//stringTOInt will be equal to what ever number rank1 has
            value1=stringToInt;
        }
        
        //for rank2 player 1         
        if (player1[i].rank2.equals("A")) 
        {
            value2=11;
        }
        else if (player1[i].rank2.equals("K")) 
        {
            value2=10;
        }
        else if (player1[i].rank2.equals("Q")) 
        {
            value2=10;
        }
        else if (player1[i].rank2.equals("J")) 
        {
            value2=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(dealer[i].rank1);//stringTOInt will be equal to what ever number rank1 has
            value2=stringToInt;
        }
        int totalvalueplayer1= value1+value2;
        System.out.println(totalvalueplayer1);

        
        }
        
        
        
    //player2
    for (int i=0; i<1; i++)
     
     {
         BLackjack cards = new BLackjack();

        if (player2[i].rank1.equals("A")) 
        {
            value1=11;
        }
        else if (player2[i].rank1.equals("K")) 
        {
            value1=10;
        }
        else if (player2[i].rank1.equals("Q")) 
        {
            value1=10;
        }
        else if (player2[i].rank1.equals("J")) 
        {
            value1=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(player2[i].rank1);//stringTOInt will be equal to what ever number rank1 has
            value1=stringToInt;
        }
        
        //for rank2 player 1         
        if (player2[i].rank2.equals("A")) 
        {
            value2=11;
        }
        else if (player2[i].rank2.equals("K")) 
        {
            value2=10;
        }
        else if (player2[i].rank2.equals("Q")) 
        {
            value2=10;
        }
        else if (player2[i].rank2.equals("J")) 
        {
            value2=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(player2[i].rank1);//stringTOInt will be equal to what ever number rank1 has
            value2=stringToInt;
      

        }
        int totalvalueplayer2= value1+value2;
        System.out.println(totalvalueplayer2);
    }
    
        //player4
    for (int i=0; i<1; i++)
     
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
