import javax.swing.JOptionPane;
public class Fundamentals3
{
    public static void main ( String[] args )
    {
        String first = JOptionPane.showInputDialog ("please enter a number");
        
        
        int a = Integer.parseInt (first);
        int mod = 0;
        mod = a%2;
        int one = 1;
        
        if(mod==one)
            {
                System.out.println("The value of a is " + a + " and it an odd number");

            }// end class if 
            
        else
            {
                System.out.println("The value of a is " + a + " and it is an even number");

            }// end class else 
        
            
            }// end class method
} //end class main
