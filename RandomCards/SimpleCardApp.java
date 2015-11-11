import javax.swing.JOptionPane;
import java.util.Random;
public class SimpleCardApp
{
    public static void main(String[] args)
    {

        String[] ranks= { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits= {"clubs","spade","diamonds","hearts"};
        //String[] cards = new String[52];
        String[] thisranks=new String[2];
        String[] thissuits= new String[2];

        SimpleCard[] deck = new SimpleCard[52];
        SimpleCard[] deck2 = new SimpleCard[52];
        String thissuit;
        //make suits loop repeat again and again???
        /*
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
         */

        for (int i=0; i<deck.length; i++)
        {
            deck[i]= new SimpleCard( suits[i%suits.length], ranks[i%ranks.length]);
        }
        for (int i=0; i<5; i++)
        {
            System.out.println(deck[(int)(Math.random()*deck.length)]);
        }

        int a = 0;
        for (int i=0; i<suits.length; i++)
        {
            for (int j=0; j<ranks.length; j++)
            {
                deck2[a] = new SimpleCard( suits[i] , ranks[j]);
                a++;
            }
        }
        for (int i=0; i<5; i++)
        {
            System.out.println(deck2[i]);
        }
    }
}