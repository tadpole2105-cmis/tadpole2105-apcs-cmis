
public class FillNums
{
   public static void main (String[] arg)
   {
   int[][] RandomNumGrid = new int[3][5] ; // 3r 4c 
   int thisnum=0; // this will be nums 1-15
   int sum;
   for (int r=0; r < RandomNumGrid.length; r++)//for each row
   {
    for (int c=0; c < RandomNumGrid[0].length; c++  )//go to col, randomnumgrid[0].length is the size of the first row which is 3
    {
       thisnum+=1;
       RandomNumGrid[r][c]= thisnum;
       System.out.print( RandomNumGrid[r][c] + "\t");
       
    }
    System.out.print( "\n");//next line after every 4 nums
   }
   
   
   for (int r=0; r < RandomNumGrid.length; r++)//for each row
   {
    for (int c=0; c < RandomNumGrid[0].length; c++  )//go to col, randomnumgrid[0].length is the size of the first row which is 3
    {
       
    }
    System.out.print( "\n");//next line after every 4 nums
    
   }
}
}

