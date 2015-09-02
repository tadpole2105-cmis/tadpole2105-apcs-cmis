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
            int overwrite= (int)(index+(Math.random()));
            
            if (overwrite==0 && overwrite==1)
                {
                    System.out.println("Micheal Jackson");
                }//end if 
            else
                {
                    System.out.println(artists[index]);
                }//end else
        }//end for loop
    }//end main
}//end fun8


//Next, use Math.random() to select a random index in the array in which to place “Michael Jackson”, effectively overwriting one of your three favorite artists. 
//Print the array a second time using a for loop verifying that “Michael Jackson” has arrived. Use a third for loop to traverse the array and find “Michael Jackson”.
// Print a statement for each element in the array stating whether or not you found Michael. 
