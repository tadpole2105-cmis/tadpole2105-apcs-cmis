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

        int[] rowhighestproduct= new int[10];
        int[] colhighestproduct= new int[10];
        int rp=0;
        int cp=0;
        int intersection = 0;
        for (int rows=0; rows < grid.length; rows++)
        {
            for (int col=0; col < grid[0].length; col++)
            {
                if (grid[rows][col]!=0) // find product
                {
                    grid[rows][col]= rows*col;
                    rowhighestproduct[rows]= grid[rows][0];
                    colhighestproduct[rows]=grid[0][col];
                    for (int i=0; i<grid[0].length; i++ ) // get row and col number
                    {
                        if(rowhighestproduct[i]>rowhighestproduct[i+1]) //[rows] or [i] ??
                        {
                            rp=rows;
                        }
                        if(colhighestproduct[i]>colhighestproduct[i+1])
                        {
                            cp=rows;
                        }
                    }

                }//end if 

                if (rows == rp && col == cp) // locate num at inter
                {
                    intersection= grid[rows][col]; //set the intersec num ans "intersection"
                    grid[rows][col]=0; //set that as 0
                }//end if 
                
                if (grid[rows][col]==0) // locate all zeros
                {
                    grid[rows][col]=intersection;
                }
                
                if (grid[rows][col]==intersection) // locate all num intersections 
                {
                    grid[rows][col]=0;
                }
                
                
                System.out.print(grid[rows][col]);
                
            }
            System.out.print(  "\n"  );//after each row add a space
        }
        

        
    }

                
                
                
                
}


//     NumGrid[rows][col]= rows*col;
//                 NumGrid[rows][0]= rows;
//                 NumGrid[0][col]= col;
//                 System.out.print(NumGrid[rows][col]+ "\t");