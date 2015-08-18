import javax.swing.JOptionPane;
public class Math
    {
    public static void main ( String[] args )
        {
         float sum= 0;
         String One = JOptionPane.showInputDialog("Enter any number");
         String Two = JOptionPane.showInputDialog("Enter another number");
         float num1 = Float.parseFloat (One);
         float num2 = Float.parseFloat (Two);
         
         sum= num2 + num1;
         System.out.println( +num1 + "+" +num2 + "=" +sum);
         System.out.println( +num2 + "+" +num1 + "=" +sum);
         
         float dif= 0;
         dif=  num2 - num1;
         System.out.println(+num1 + "-" +num2 + "=" +dif);
         System.out.println(+num2 + "-" +num1 + "=" +dif);
         
         float mul=0;
         mul= num2*num1;
         System.out.println(+num1 + "x" +num2 + "=" +mul);
         System.out.println(+num2 + "x" +num1 + "=" +mul);
         
         float quo1=0;
         float quo2=0;
         quo1= num2/num1;
         quo2= num1/num2;
         System.out.println(+num1 + "/" +num2 + "=" +quo2);
         System.out.println(+num2 + "/" +num1 + "=" +quo1);
        
         float mod1=0;
         float mod2=0;
         mod1= num1%num2;
         mod2= num2%num1;
        
        }
        {
        
         
        }    // end mehod main
        
    } // end class Math