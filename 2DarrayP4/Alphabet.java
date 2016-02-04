import javax.swing.JOptionPane;
public class Alphabet
{
    public static void main (String[] arg)
    {
        String rString = JOptionPane.showInputDialog ("enter row dimension");
        String cString = JOptionPane.showInputDialog ("enter column dimension");
        int c = Integer.parseInt (cString);
        int r = Integer.parseInt (rString);
        int thisnum=0;
        String[][] alphabet = new String[c][r] ;
        String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


        for (int rows=0; rows < alphabet.length; rows++)
        {
            for (int col=0; col < alphabet[0].length; col++)
            {
                
                    alphabet[rows][col]= letters[thisnum] ;
                    System.out.print( alphabet[rows][col]  );
                    thisnum++;
                    if (thisnum==26)
                    {
                        thisnum-=25;
                        System.out.print( letters[thisnum-1]  );
                    }

            }

            System.out.print( "\n"  );
        }

    }

}
