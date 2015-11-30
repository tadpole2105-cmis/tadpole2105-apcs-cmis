
public class Uni
{
    public static void main (String[] args)
    {
     String s1= new String("UBC");
     String s2=new String("UCIC");
     String s3=new String("Bristols");
   
    
    
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareTo(s3));
    System.out.println(s2.compareTo(s1));
    System.out.println(s2.compareTo(s3));
    System.out.println(s3.compareTo(s1));
    System.out.println(s3.compareTo(s2));
    }
}


//the output of compareTo() will give the number of difference in terms of alphabetical order between the strings being compared
//When compreTo() sees two same letters, it ignors both and moves on to compare the next two letters. If it cannot find any different letters, it returns 0

/*
Write a program that creates three String objects. Each String should be the name of a university to which you are applying. 
Now we are going to compare the universities with the String method compareTo(). Print out the result of comparing each school to another.
 For example, if s1 and s2 are defined as follows: 



String school1 = new String ( “Stanford” ); 
String school2 = new String ( “Oregon” ); 
String school3 = new String ( “UCLA” ); 
We can compare the schools as follows: 
System.out.println( school1.compareTo( school2 ); 
Answer the questions below in a comment after all of your source code: 
a. What is the output of the compareTo() method telling us? 
b. Compare to schools that have the same first letter and a different second letter. What does compareTo() do in this case?
*/