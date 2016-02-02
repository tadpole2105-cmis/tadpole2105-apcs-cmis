
public class FillNums
{
   public static void main (String[] arg)
   {
   int[][] NumGrid = new int[3][5] ; // 3r 4c 
   int thisnum=0; // this will be nums 1-15
   int totalsum=0;
   int rowsum=0;
   int colsum=0;
   //int[] rowsum=new int [5];//create 5
   //int[] colsum= new int[3];
   for (int r=0; r < NumGrid.length; r++)//for each row
   {
    for (int c=0; c < NumGrid[0].length; c++  )//go to col, randomnumgrid[0].length is the size of the first row which is 5
    {
       thisnum+=1;
       NumGrid[r][c]= thisnum; // this fills increasing [r][c] w/ 1 ++
       // if numgrid[r][c] = r then it'll be 0000 \n 1111 \n 2222
       System.out.print( NumGrid[r][c] + "\t");
       totalsum+=NumGrid[r][c] ;
       colsum+=NumGrid[r][c];
       //rowsum[r] += NumGrid[r][0];
       //colsum[c] += NumGrid[0][c];
    }
    
    System.out.print( "\t" + "colsum"  + colsum +"\n");//next line after every 5 nums
    
   }
   System.out.println( "total sum" + totalsum);

   
   int thisnum2=0;
   for (int r=0; r < NumGrid.length; r++)//for each row
   {
    for (int c=0; c < NumGrid[0].length; c++  )//go to col, randomnumgrid[0].length is the size of the first row which is 3
    {
       thisnum2+=1;
       NumGrid[r][c]= thisnum2; // if numgrid[r][c] = r then it'll be 0000 \n 1111 \n 2222
       System.out.print( NumGrid[0][c] + "\t");
    }
    System.out.print( "\n");//next line after every 4 nums
   }


   


}
}

