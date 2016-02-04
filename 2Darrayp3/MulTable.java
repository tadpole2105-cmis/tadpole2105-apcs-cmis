import javax.swing.JOptionPane;
public class MulTable
{
    public static void main (String[] arg)
    {
        String rString = JOptionPane.showInputDialog ("enter a number to generate a multiplication table");
        String cString = JOptionPane.showInputDialog ("how many multiples of each num?");
        int c = Integer.parseInt (cString);
        int r = Integer.parseInt (rString);

        int[][] NumGrid = new int[c][r] ; 

        int thisnum= 0;

        for (int rows=0; rows < NumGrid.length; rows++)
        {
            for (int col=0; col < NumGrid[0].length; col++)
            {
                
                    NumGrid[rows][col]= rows*col;
                    NumGrid[rows][0]= rows;
                    NumGrid[0][col]= col;
                    System.out.print(NumGrid[rows][col]+ "\t");

            }

            System.out.print( "\n"  );
        }

    }

}

