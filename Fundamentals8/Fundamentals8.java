import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
public class Fundamentals8
{
    public static void main (String[] args)
    {
        String artists[]= new String [3];
        {
            artists[0]="Taylor Swift";
            artists[1]="Paramore";
            artists[2]="Ariana Grande";
        }//end array artist 
        
        for (int index=0; index<artists.length; index++)
        {
            System.out.println(artists[index]);
        }//end for loop 1
        
        artists[(int)(Math.random() * 4)] = "Micheal Jackson"; //assign mj to a random number of the artist array, has to be outside loop otherwise there might be more than 1 mj
        
        
        for (int index=0; index<artists.length; index++)
        {
         
             System.out.println(artists[index]);
                
        }//end for loop2
        
        for (int index=0; index<artists.length; index++)
        {
            if (artists[index].equals("Micheal Jackson"))//artists will pick up an increasing # each time it loops but where mj is defined is already fixed since it came before loop2
            {
                System.out.println("found mj");
                
            }//end if 
            else
            {
                System.out.println("no mj");
            }//end else 
        }//end for loop3
       
        
    }//end main
}//end fun8


//If you want to generate a number from 0 to 100 then your code would look like this:
//(int)(Math.random() * 101);


//To generate a number from 10 to 20 :
//(int)(Math.random() * 11 + 10);

