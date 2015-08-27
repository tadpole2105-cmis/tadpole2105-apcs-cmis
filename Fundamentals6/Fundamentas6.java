
import javax.swing.JOptionPane;
import java.util.Random;
public class Fundamentas6
{
    
     public static void main (String[] args)
        {
            int[] num= new int[50];
            
                {
                    System.out.println("\n");
                    for (int index = 0; index < num.length; index++)
                        {
                            int numNew = (int)(100-( index* Math.random()));
                            System.out.println(numNew);
                            
                        }//end for loop - assign random value to each num
                }//end array 
        
       
       
        }//end main
}//end class fun6
