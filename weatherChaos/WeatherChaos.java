import javax.swing.JOptionPane;
public class WeatherChaos
{
    public static void main ( String[] argv )
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Type a number "));
        int[] temp = new int[input]; 
        for ( int i = 0; i < temp.length; i++ )
        {
            temp[i] = (Math.random() * 99) + 1;
        }
        
        
        double[] randomNumbers = new double[input];
        int thisNumber;
        String output;
        String symbol;
        
        for ( int i = 0; i < randomNumbers.length; i++ )
        {
            randomNumbers[i] = (Math.random() * 49) + 1;
        }
        
        for ( int i = 0; i < randomNumbers.length; i++ )
        {
            System.out.println(i+": "+randomNumbers[i]);
            
        }
        for ( int i = randomNumbers.length - 1; i >= 0; i-- )
        {
            System.out.print(i+": ");
            thisNumber = (int) randomNumbers[i];
            output = "";
            if ( thisNumber % 2 == 0 )
            {
                symbol = "E";
            }
            else
            {  
                symbol = "O";
            }
            
            while ( thisNumber > 0 )
            {
                output += symbol;
                thisNumber--;
            }
            
            System.out.println(output+randomNumbers[i]);
            
            
        }   
    }
}
