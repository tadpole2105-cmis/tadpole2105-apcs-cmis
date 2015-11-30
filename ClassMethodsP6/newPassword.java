import javax.swing.JOptionPane;
import java.util.Scanner;
public class newPassword
{
    public static void main (String[] args)
    {
        String userPassword =JOptionPane.showInputDialog("enter password");
        if (userPassword.length >= 6)
        {
            if (userPassword)//if it contains non alpha
            {
                
            }
        }
        else 
        {
            System.out.print("rejected");
        }
    }
}








/*
Write a “Create new password” program that requires passwords to have a length of at least 6 characters
 and at least one non-alphanumeric character (+, -, *, /, or @.) 
 Passwords that do not meet these requirements should be rejected. 
 Use the String method substring() which returns String that is “part of” or “substring” of a given String.
 
 
 Consider the following example: 
String password = new String( "abc*D_" ); 
System.out.println( password.substring( 3,4 ) ); 
// prints “*” 
Since the substring method returns a String, you can compare it to another String using String.equals(). Below, we extract one letter from the password and determine if it is equal to “*”. String oneLetter = new String( password.substring( 3,4 ) ); 
oneLetter.equals( “*” ); // result is true 
If a successful password has been entered, the program should end (i.e. the program should not ask the user for another password or remain in an endless loop).
*/
