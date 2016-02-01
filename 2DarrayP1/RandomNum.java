
public class RandomNum
{
   public static void main (String[] arg)
   {
   int[][] RandomNumGrid = new int[3][4] ; // 3r 4c 
   
   for (int r=0; r < RandomNumGrid.length; r++)//for each row
   {
    for (int c=0; c < RandomNumGrid[0].length; c++  )//go to col, randomnumgrid[0].length is the size of the first row which is 3
    {
       RandomNumGrid[r][c]= (int) (Math.random()*10);
       System.out.print( RandomNumGrid[r][c] + "\t");
       
    }
    System.out.print( "\n");//next line after every 4 nums
   }
   
   
   for (int r=0; r < RandomNumGrid.length; r++)//for each row
   {
    for (int c=0; c < RandomNumGrid[0].length; c++  )//go to col, randomnumgrid[0].length is the size of the first row which is 3
    {
       if (RandomNumGrid[r][c]==5)
       {
           System.out.print("Rows" + r + "    "  + "col" + c );
       }
    }
    System.out.print( "\n");//next line after every 4 nums
    
   }
}
}






