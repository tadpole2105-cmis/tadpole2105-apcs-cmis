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
        
       for(int num=0; num< movies.length; num++)
        {
            System.out.println(movies[num]+"\n");
        }//end for loop
       String[] songs= {"Chameleon","The cave","Demons"};
       int count = 1 ;
       System.out.println("\n");
       while ( count<2) 
        {
            System.out.println(Arrays.toString(songs));
            count++;
        }//end while loop
       
   }//end main
}//end fun5
