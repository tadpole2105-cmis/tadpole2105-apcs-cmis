import java.util.Arrays;
public class Fundamentals5

{
   public static void main (String[] args)
   {
       String[] movies= new String[3];
        {
            movies[0] = "Avatar";
            movies[1] = "Harry Potter";
            movies[2] = "Star Wars";
        }//end array movies
        String[] songs= new String[3];
        {
            songs[0] = "Chameleon";
            songs[1] = "The cave";
            songs[2] = "Demons";
        }//end array songs
       for(int num=0; num< movies.length; num++)
        {
            System.out.println(movies[num]+"\n"+"\n");
        }//end for loop
       int count = 1 ;
       while ( count<2) 
        {
            System.out.println(Arrays.toString(songs));
            count++;
        }//end while loop
       
   }//end main
}//end fun5
