import javax.swing.JOptionPane;
public class Fundamentals2
{
    public static void main ( String[] args )
    {
        String first = JOptionPane.showInputDialog ("please enter a number");
        String second = JOptionPane.showInputDialog ("enter a number a number again");
        
        int a = Integer.parseInt (first);
        int b = Integer.parseInt (second);
        
        if(a>b)
            {
                System.out.println("The value of a is " + a + " and it is more that b whose value is " + b);

            }// end class if 
        if(a==b)
            { 
                System.out.println("The value of a is " + a + " and it is equal that b whose value is " + b);
            }    
        else
            {
                System.out.println("The value of a is " + a + " and it is less that b whose value is " + b);

            }// end class else 
        
            
            }// end class method
} //end class main
