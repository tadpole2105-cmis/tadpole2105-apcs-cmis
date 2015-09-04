
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
                    array[num2] = (double)(Math.random()*(50+1));
                    String reverse = //change array num to string 
                }//reverse random
                System.out.println(num1 + "\t" + reverse);
            }// end for loop
        
    }//end main
}//end class test1
              

//
                //System.out.print("\t");
                //To generate a number from 10 to 20 :
//(int)(Math.random() * 11 + 10);
