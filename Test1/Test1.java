
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
public class Test1
{
    public static void main (String[] args)
    {
        String usernum = JOptionPane.showInputDialog ("Enter a number");
        int arraylength = Integer.parseInt(usernum);
        int[] array = new int[arraylength];
        int counterf=0;
        for (int num=0; num<array.length; num++)
            {
                double randomnum = Math.random();
                System.out.println(num + "\t" + (double)(Math.random()*(50+1))  );
                
                
                
                
               
                
              }//end for loop  
    }//end main
}//end class test1
              

//
                //System.out.print("\t");
                //To generate a number from 10 to 20 :
//(int)(Math.random() * 11 + 10);
