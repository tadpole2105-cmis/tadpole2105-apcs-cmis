public class Swapper
{
    public static void main ( String[] args )
    {
        /*
         * In the 2d array of integers below, find the row and the column with the highest product (disregard any zeros).
         * Then, find the value at the intersection of that row and column.
         * Then, swap all occurances of that value in the array for zero and all occurances of zero in the array for that value.
         * Print out the grid.
         * 
         * For example, if row 4 and column 5 have the largest products, the value at the intersection would be 7.
         * Then you would swap all 7s for 0s and 0s for 7s. The result would be this:
         * 9 7 2 5 7 9 7 5 8 5
         * 4 8 1 0 7 5 3 6 2 7
         * 0 0 5 6 7 5 6 6 4 7
         * 5 1 6 2 2 2 7 9 1 9
         * 7 0 8 9 7 0 4 3 8 6
         * 1 7 5 6 3 2 9 3 5 3
         * 5 3 1 4 9 9 1 3 4 8
         * 5 6 9 9 0 8 0 3 9 3
         * 1 7 4 8 3 1 7 2 1 5
         * 1 0 3 6 3 0 8 3 3 6
         */
        int[][] grid = new int[][] {{9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};
        int[] rowproduct= new int[10]; //{0,0,....,0}
        int[] colproduct= new int[10];
        for( int  i = 0; i < 10; i++)
        {
            rowproduct[i] = 1;
            colproduct[i] = 1;
        }
        int rhp=0;
        int chp=0;
        int rp=0;
        int cp=0;
        int intersection = 0;
        for (int row=0; row < grid.length; row++)
        {
            for (int col=0; col < grid[0].length; col++)
            {
                if (grid[row][col]!=0) // find product
                {
                    rowproduct[row] *= grid[row][col];
                    colproduct[col] *= grid[row][col];
                }//end if 
            }
        }
        for(int i = 0 ;i < 10; i ++)
        {
            if(rowproduct[i]>rhp) //[rows] or [col] ??  row cuz we only compare when it has finished multiplying
            {
                rp=i;
                rhp = rowproduct[i];
            }
            if(colproduct[i]>chp)
            {
                cp=i;
                chp =colproduct[i];
            }
        }
        intersection = grid[rp][cp];
        System.out.println("--------------");
        System.out.println("Number replaced = "+ intersection + "(Row " + (rp+1)+", Col "+(cp+1) +")" );
        System.out.println("--------------");
        for (int rows=0; rows < grid.length; rows++)
        {
            for (int col=0; col < grid[0].length; col++)
            {
                if (grid[rows][col]==0) // locate all zeros
                {
                    grid[rows][col]=intersection;
                }

                if (grid[rows][col]==intersection) // locate all num intersections 
                {
                    grid[rows][col]=0;
                }
                System.out.print(grid[rows][col] + "  ");
            }
            System.out.print("\n");
        }
    }
}


///mistakes 
// 1. original num in grid was replaced by product, product supposed to go in col/row product array right away, no need to put somewhere else 


//     NumGrid[rows][col]= rows*col;
//                 NumGrid[rows][0]= rows;
//                 NumGrid[0][col]= col;
//                 System.out.print(NumGrid[rows][col]+ "\t");