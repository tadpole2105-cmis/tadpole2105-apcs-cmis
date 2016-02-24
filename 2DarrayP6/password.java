import javax.swing.JOptionPane;
import java.util.Scanner;

//password must not contain lastname, must be atleast 6, must have a symbol

public class password
{
    public static void main(String[] args)
    {
        String userLastname =JOptionPane.showInputDialog("enter lastname");
        String userPassword =JOptionPane.showInputDialog("enter password");
        boolean loopagain=true;
        String lowercaseLn = userLastname.toLowerCase();
        String lowercasePw = userPassword.toLowerCase();
        
        while (loopagain)
        {
            if (lowercasePw .length() >= 6)
            {
                if (lowercaseLn.indexOf(lowercasePw) < 0)
                {
                    if (lowercasePw .contains("+") || lowercasePw .contains("-") ||  lowercasePw .contains("*") ||  lowercasePw .contains("/") ||  lowercasePw .contains("@") )
                    {
                        System.out.print("logged in");
                        loopagain=false;
                    }
                    else
                    {
                        lowercasePw = JOptionPane.showInputDialog( "What is your password?").toLowerCase();
                    }
                }
                else
                {
                    lowercasePw = JOptionPane.showInputDialog( "What is your password?").toLowerCase();
                }
            }

            else
            {
                lowercasePw = JOptionPane.showInputDialog( "What is your password?").toLowerCase();
            }
        }
    }//end method main
}

/*
 * 
 * to use: indexOf is a method, x.indexOf(String y), y is compared to x, if there are many letter matches, it will return how many letters match
 *  
public int indexOf(int ch): Returns the index within this string of the first occurrence of the specified character or -1 if the character does not occur.

public int indexOf(int ch, int fromIndex): Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index or -1 if the character does not occur.

int indexOf(String str): Returns the index within this string of the first occurrence of the specified substring. If it does not occur as a substring, -1 is returned.

int indexOf(String str, int fromIndex): Returns the index within this string of the first occurrence of the specified substring, starting at the specified index. If it does not occur, -1 is returned.

if (userPassword.length() >= 6)
{
for (int i=0; i< userPassword.length(); i++)
{

if (lowercaseLn.indexOf(lowercasePw) <= 0) 
{
if(userPassword.substring(i, i+1).equals("+") || userPassword.substring(i, i+1).equals("-") || userPassword.substring(i, i+1).equals("*") || userPassword.substring(i, i+1).equals("@") ) //if any part of the password contains 
{
System.out.print("logged in");
i= userPassword.length();//break loop
}
else if ( i == userPassword.length())
{
System.out.print(userPassword + " does not on contain a non alphabet");

}
}//2nd if: must not contain lastname 
else
{ 
lowercasePw = JOptionPane.showInputDialog( "What is your password?").toLowerCase();
}
}

}// 1st if : must be more than 6 letters
else 
{
System.out.print("rejected : less than 6 characters");
}// 1st if : must be more than 6 letters
 */