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

        for (int rows=0; rows < 10000000; rows++)
        {
            for (int col=0; col < NumGrid[0].length; col++)
            {

                NumGrid[rows][col]= thisnum;
                
                
                for (int i=0; i< c; i++ )
                {
                    System.out.print(NumGrid[rows][col] + "\t");
                    
                }
                thisnum++;
            }
            System.out.print(NumGrid[rows+1][0] + "\t");
            //////////////// this is for the most left column
            // 
            //                 thisnum=0;
            //                 NumGrid[0][rows]= thisnum;
            //                 thisnum++;
            //                 NumGrid[0][rows]= thisnum;
            //                 System.out.print(NumGrid[0][rows] + "\t");

            //////////////////////

            System.out.print( "\n"  );
        }

    }

}

