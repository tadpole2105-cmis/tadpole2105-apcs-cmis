import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
public class Fundamentals7
{
    public static void main (String[] args)
    {
        int[] array= new int[10];
        int counterf=0;
        for (int num=0; num<array.length; num++)
            {
                double negpos = Math.random();
                
                
                if (negpos > 0.5)
                {
                    array[num]= (int)(-100*(Math.random()));
                    System.out.print(array[num]);
                }//end if 
                else
                {
                    array[num]= (int)(100*(Math.random()));
                    System.out.print(array[num]);
                    
                    counterf++;
                        if (num==(int)(array.length-1))
                            {
                                   System.out.print("there are "+ counterf + " positive numbers in the for loop" );
                            }//end if counter
                }//end else
                System.out.print("\t");
                
              }//end for loop  
              
        System.out.print(""); 
        
        int counterw=0;
        int numw=0;      
        while (numw<array.length)
            {
               float negposw= (float) (Math.random());
               
               
               if (negposw<0.5)
               {
                   array[numw]= (int)(-100*(Math.random()));
                   System.out.println(array[numw]);
               }//end if while
               
               else 
               {
                   array[numw]= (int)(100*(Math.random()));
                   System.out.println(array[numw]);
                  
                   counterw++;
                        if (numw==array.length-1)
                            {
                                    System.out.print("there are "+ counterw + " positive numbers in the while loop" );
                            }//end if counter
               }//end else while
               System.out.print("\t");
               numw++;
               
            }//end while
        
        
                
            
        

    }//end main
}// end fun7


//array[num] int randomnum = int (100-(Math.random()));
                //System.out.print(randomnum);