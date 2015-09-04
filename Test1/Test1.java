
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
public class Test1
{
    public static void main (String[] args)
    {
        String usernum = JOptionPane.showInputDialog ("Enter a number");
        int arraylength = Integer.parseInt(usernum);
        double[] array = new double[arraylength];
        int counterf=0;
        for (int num=0; num<array.length; num++)
            {
                
                array[num] = (double)(Math.random()*(50+1));
                System.out.println(num + "\t" + array[num]  );
   
                
              }//end for loop  
        for (int num1=array.length; num1>=0; num1--)
            {
                for (int num2=0; num2<array.length; num2++)
                {
                    
                    int e=0;
                    int o=0;
                    array[num2] = (double)(Math.random()*(50+1));
                    int newarray[] = (int)(array[num2]); //change every number from array to int
                    if (newarray[num2]%2=0)//seperate if odd or even
                    
                    {
                          
                    }//end if 
                    
                    else 
                    
                    {
                        
                    }// end else
                    String[] reverse = new String[arrray[num]];//change array num to string to isolate each
                    int oddcounter= 0;
                    int evencounter= 0;
                    for (num3=0; num3<reverse[num].length; num3++)// for every letter in reverse
                    {
                        
                        int individual = Integer.parseInt(reverse[num3]);//change string letter back to int 
                        if (reverse[num3]%2=0)
                         {
                             evencounter++;
                             
                         }//end if 
                        
                        else
                         {
                             oddcounter++;
                         }//end else 
                        
                         // make counter equal to how many Es and Os
                    for (num5=0; num5<evencounter.length; num5++)
                    {
                    }//end for 
                    for (num5=0; num5<evencounter.length; num5++)
                    
                    {
                    }//end for 
                        
                    }// end counter odd even
                    
                    evencounternew = evencounter;
                    oddcounternew = oddcounter;
                    
                    
                    System.out.println(num1 + "\t" + reverse);
                }//reverse random
                
            }// end for loop
        
    }//end main
}//end class test1
              

//
                //System.out.print("\t");
                //To generate a number from 10 to 20 :
//(int)(Math.random() * 11 + 10);
