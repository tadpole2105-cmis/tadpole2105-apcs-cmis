
public class FillNums
{
    public static void main (String[] arg)
    {
        int[][] NumGrid = new int[3][5] ; // 3r 4c 
        int thisnum=0; // this will be nums 1-15
        int totalsum=0;

        for (int r=0; r < NumGrid.length; r++)//for each updown
        {
            int rowsum=0;
            int colsum=0;

            for (int c=0; c < NumGrid[0].length; c++  )//go to col, randomnumgrid[0].length is the size of the first row which is 5
            {
                thisnum+=1;
                NumGrid[r][c]= thisnum; // this fills increasing [r][c] w/ 1 ++
                // if numgrid[r][c] = r then it'll be 0000 \n 1111 \n 2222
                System.out.print( NumGrid[r][c] + "\t");
                totalsum+=NumGrid[r][c];

            }
            for (int i=0; i <NumGrid[0].length; i++)
            {
                rowsum+=NumGrid[r][i];

            }
            System.out.print( "\t" + "rowsum = " + rowsum +   "\n"  );

        }
        System.out.println( "total sum" + totalsum);

        
        for (int i=0; i <NumGrid[0].length; i++)
        {
            int colsum=0;
            for (int u=0; u< NumGrid.length; u++)
            {
                colsum+=NumGrid[u][i]; 
                
            }
            System.out.print( "\t" + "colsum = " + colsum +   "\n"  );
        }

             
    }
}

//       for (int u=0; u< NumGrid.length; u++)
//             {
//                 colsum+=NumGrid[r][u]; 
//                 System.out.print( "\t" + "colsum = " + colsum +   "\n"  );
// 
//             }