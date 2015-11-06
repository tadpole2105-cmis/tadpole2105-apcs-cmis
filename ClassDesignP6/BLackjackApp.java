import java.util.Random;
public class BLackjackApp
{
    public static void main(String[] args)
    {

    String[] ranks= { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String[] suits= {"clubs","spade","diamonds","hearts"};
    String Card;
   
    
    //no need for for loop 
    //blackjack d = new blackjack ()
    
    int value1;
    int value2;
    
    //int totalvalueplayer1,totalvalueplayer2,totalvalueplayer3,totalvalueplayer4,totalvalueplayer5;
    
    //dealer

        BLackjack dealer = new BLackjack();
        
        //for rank1
        if (dealer.rank1.equals("A")) // go look at rank1 for card 1 of dealer
        {
            value1=11;
        }
        else if (dealer.rank1.equals("K")) // go look at rank1 for dealer
        {
            value1=10;
        }
        else if (dealer.rank1.equals("Q")) // go look at rank1 for dealer
        {
            value1=10;
        }
        else if (dealer.rank1.equals("J")) // go look at rank1 for dealer
        {
            value1=10;
        }
        else  // go look at rank1 for dealer
        {
            int stringToInt=Integer.parseInt(dealer.rank1);//stringTOInt will be equal to what ever number rank1 has
            value1=stringToInt;
        }
        
        //for rank2        
        if (dealer.rank2.equals("A") && dealer.rank2==dealer.rank1) // go look at rank12 for dealer
        {
            value2=1;
        }
        else if (dealer.rank2.equals("A"))
        {
            value2=11;
        }
        
        
        else if (dealer.rank2.equals("K")) // go look at rank2 for dealer
        {
            value2=10;
        }
        else if (dealer.rank2.equals("Q")) // go look at rank1 for dealer
        {
            value2=10;
        }
        else if (dealer.rank2.equals("J")) // go look at rank1 for dealer
        {
            value2=10;
        }
        else  // will take care of the rest of the items which are numbers
        {
            int stringToInt=Integer.parseInt(dealer.rank2);//stringTOInt will be equal to what ever number rank1 has
            value2=stringToInt;
        }
        int totalvaluedealer= value1+value2;
        System.out.println("dealer" + "\n" + dealer + "\t" + totalvaluedealer);
        System.out.println();
        
        
        //////////////////////////////////////////////////////////player 1 //////////////////////////////////////
         BLackjack player1 = new BLackjack();
        if (player1.rank1.equals("A")) 
        {
            value1=11;
        }
        else if (player1.rank1.equals("K")) 
        {
            value1=10;
        }
        else if (player1.rank1.equals("Q")) 
        {
            value1=10;
        }
        else if (player1.rank1.equals("J")) 
        {
            value1=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(player1.rank1);//stringTOInt will be equal to what ever number rank1 has
            value1=stringToInt;
        }
        
        //for rank2 player 1         
        if (player1.rank2.equals("A")) 
        {
            value2=11;
        }
        else if (player1.rank2.equals("K")) 
        {
            value2=10;
        }
        else if (player1.rank2.equals("Q")) 
        {
            value2=10;
        }
        else if (player1.rank2.equals("J")) 
        {
            value2=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(player1.rank2);//stringTOInt will be equal to what ever number rank1 has
            value2=stringToInt;
        }
        int totalvalueplayer1= value1+value2;
        System.out.println("player 1" + "\n" + player1 + "\t" + totalvalueplayer1);
        System.out.println();
 
         //////////////////////////////////////////////////////////player 2 //////////////////////////////////////
        
        
         BLackjack player2 = new BLackjack();

          //rank1
        if (player2.rank1.equals("A")) 
        {
            value1=11;
        }
        else if (player2.rank1.equals("K")) 
        {
            value1=10;
        }
        else if (player2.rank1.equals("Q")) 
        {
            value1=10;
        }
        else if (player2.rank1.equals("J")) 
        {
            value1=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(player2.rank1);//stringTOInt will be equal to what ever number rank1 has
            value1=stringToInt;
        }
        
        //rank2       player2
        if (player2.rank2.equals("A")) 
        {
            value2=11;
        }
        else if (player2.rank2.equals("K")) 
        {
            value2=10;
        }
        else if (player2.rank2.equals("Q")) 
        {
            value2=10;
        }
        else if (player2.rank2.equals("J")) 
        {
            value2=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(player2.rank2);//stringTOInt will be equal to what ever number rank1 has
            value2=stringToInt;
      

        }
        int totalvalueplayer2= value1+value2;
        System.out.println("player 2" + "\n" + player2 + "\t" + totalvalueplayer2);
        System.out.println();
 
         //////////////////////////////////////////////////////////player 3 //////////////////////////////////////
        
           BLackjack player3 = new BLackjack();

        if (player3.rank1.equals("A")) 
        {
            value1=11;
        }
        else if (player3.rank1.equals("K")) 
        {
            value1=10;
        }
        else if (player3.rank1.equals("Q")) 
        {
            value1=10;
        }
        else if (player3.rank1.equals("J")) 
        {
            value1=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(player3.rank1);//stringTOInt will be equal to what ever number rank1 has
            value1=stringToInt;
        }
        
        //for rank2 player 3     
        if (player3.rank2.equals("A")) 
        {
            value2=11;
        }
        else if (player3.rank2.equals("K")) 
        {
            value2=10;
        }
        else if (player3.rank2.equals("Q")) 
        {
            value2=10;
        }
        else if (player3.rank2.equals("J")) 
        {
            value2=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(player3.rank2);//stringTOInt will be equal to what ever number rank1 has
            value2=stringToInt;
      

        }
        int totalvalueplayer3= value1+value2;
        System.out.println("player 3" + "\n" + player3 + "\t" + totalvalueplayer3);
        System.out.println();
 
         //////////////////////////////////////////////////////////player 4 //////////////////////////////////////
        
        
          BLackjack player4 = new BLackjack();
        //rank1 player4
        if (player4.rank1.equals("A")) 
        {
            value1=11;
        }
        else if (player4.rank1.equals("K")) 
        {
            value1=10;
        }
        else if (player4.rank1.equals("Q")) 
        {
            value1=10;
        }
        else if (player4.rank1.equals("J")) 
        {
            value1=10;
        }
        else   
        {
            int stringToInt=Integer.parseInt(player4.rank1);//stringTOInt will be equal to what ever number rank1 has
            value2=stringToInt;
        }
        
        //for rank2 player 4     
        if (player4.rank2.equals("A")) 
        {
            value2=11;
        }
        else if (player4.rank2.equals("K")) 
        {
            value2=10;
        }
        else if (player4.rank2.equals("Q")) 
        {
            value2=10;
        }
        else if (player4.rank2.equals("J")) 
        {
            value2=10;
        }
        else  
        {
            int stringToInt=Integer.parseInt(player4.rank2);//stringTOInt will be equal to what ever number rank1 has
            value2=stringToInt;
      

        }
        int totalvalueplayer4= value1+value2;
        System.out.println("player 4" + "\n" + player4 + "\t" + totalvalueplayer4);
        System.out.println();
 
         //////////////////////////////////////////////////////////player 5 //////////////////////////////////////
        
        
          BLackjack player5 = new BLackjack();
        //rank1 player 5
        if (player5.rank1.equals("A")) 
        {
            value1=11;
        }
        else if (player5.rank1.equals("K")) 
        {
            value1=10;
        }
        else if (player5.rank1.equals("Q")) 
        {
            value1=10;
        }
        else if (player5.rank1.equals("J")) 
        {
            value1=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(player5.rank1);//stringTOInt will be equal to what ever number rank1 has
            value1=stringToInt;
        }
        
        //for rank2 player 5    
        if (player5.rank2.equals("A")) 
        {
            value2=11;
        }
        else if (player5.rank2.equals("K")) 
        {
            value2=10;
        }
        else if (player5.rank2.equals("Q")) 
        {
            value2=10;
        }
        else if (player5.rank2.equals("J")) 
        {
            value2=10;
        }
        else  // go look at rank1 for player1
        {
            int stringToInt=Integer.parseInt(player5.rank2);//stringTOInt will be equal to what ever number rank1 has
            value2=stringToInt;
      

        }
        int totalvalueplayer5= value1+value2;
        System.out.println("player 5" + "\n" + player5 + "\t" + totalvalueplayer5);
        System.out.println();
    
        ///////////////////////////////////////////////////////////////comparing sccores//////////////////////////////////////////////////////////////////////////
        
        
        if (totalvalueplayer1== 21 || totalvalueplayer1 > totalvaluedealer)
        {
           System.out.println("player1 is the winner"); 
        }
        else if (totalvalueplayer1<=totalvaluedealer || totalvalueplayer1<21 )
        {
            System.out.println("player1 looses"); 
        }
   
        
        
         if(totalvalueplayer2== 21 || totalvalueplayer2 > totalvaluedealer)
        {
           System.out.println("player2 is the winner"); 
        }
        else if (totalvalueplayer2<=totalvaluedealer || totalvalueplayer2<21 )
        {
            System.out.println("player2 looses"); 
        }
       
        
        
         if(totalvalueplayer3== 21 || totalvalueplayer3 > totalvaluedealer)
        {
           System.out.println("player3 is the winner"); 
        }
        else if (totalvalueplayer3<=totalvaluedealer || totalvalueplayer3<21 )
        {
            System.out.println("player3 looses"); 
        }
        
        
        
        
      if(totalvalueplayer4== 21 || totalvalueplayer4 > totalvaluedealer)
        {
           System.out.println("player4 is the winner"); 
        }
        else if (totalvalueplayer4<=totalvaluedealer || totalvalueplayer4<21 )
        {
            System.out.println("player4 looses"); 
        }
        
        
        
        if(totalvalueplayer5== 21 || totalvalueplayer5 > totalvaluedealer)
        {
           System.out.println("player5 is the winner"); 
        }
        else if (totalvalueplayer5<=totalvaluedealer || totalvalueplayer5<21 )
        {
            System.out.println("player5 looses"); 
        }
        
        
        
        
    }//end method main
}
