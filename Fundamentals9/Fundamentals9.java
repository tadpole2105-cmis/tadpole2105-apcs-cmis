import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
public class Fundamentals9
{
   public static void main ( String[] args )
   {
   String username = JOptionPane.showInputDialog ("Username :");
   String a = JOptionPane.showInputDialog ("Password :");
   
   int password = Integer.parseInt(a);
   
   if (username.equals("Tadpole") && password == 2105)
   {
       System.out.print("You are logged in");
       
   }// end if 
   else
   {
       System.out.print("Incorrect username or password");
       
   }// end else 
   }//end main
}// end fun9
