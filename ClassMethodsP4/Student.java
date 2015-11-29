import javax.swing.JOptionPane;
import java.util.Scanner;
public class Student
{
    private String fname;
    private String lname;
    private int age;
    private String letterGrade;
    private String thisGrade;
    
    private double[] studentGrades= new double[5];
    //private double[] studentGradesSubjects= {english, math, science, arts, social};
    
    private double A=4.00;
    private  double B=3.00;
    private  double C=2.00;
    private  double D=1.00;
    private  double F=0.00;

    
       //these are the random grades (0.0 -4.0) for each subject that will be put into the setter method 
    private double english = 0;
    private double math = 0;
    private double science = 0;
    private double arts = 0;
    private double social =0;
    
 
    private double GPA,aveGPA;
    
    /////////////////////////// might not use
    public Student(double english, double math, double science, double arts, double social)
     {
        this.english=english;
        this.math=math;
        this.science=science;
        this.arts=arts;
        this.social=social;
     }

    public Student()
    {
       fname="Voldemort";
       lname="Lee";
       age=6;
       for (int i=0; i<studentGrades.length; i++)
       {
           studentGrades[i]=Math.random()*4;
       }//set all slots of studentGrades array to 0.0
    }//end single arg constructor 

    
    public Student(String fname, String lname, int age, double english, double math, double science, double arts, double social)///put array in muti agr?
    {
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        studentGrades[0]=english;
        studentGrades[1]=math;
        studentGrades[2]=science;
        studentGrades[3]=arts;
        studentGrades[4]=social;
        
    }//end multi arg 
    
    public double aveGPA()
    {
            double totalGPA=0;
        for (int i=0;i<studentGrades.length; i++)
        {
            totalGPA += studentGrades [i];
        }
        aveGPA= totalGPA /studentGrades.length;
        return aveGPA;
    }
    
    public String getGrade()
    {
    
            if (aveGPA<=A && aveGPA>B)
            {
                thisGrade= "A";
            }
            else if (aveGPA<=B && aveGPA>C)
            {
                thisGrade= "B";
            }
            else if (aveGPA<=C&& aveGPA>D)
            {
                thisGrade= "C";
            }
            else if (aveGPA<=D && aveGPA>F)
            {
                thisGrade= "D";
            }
            else
            {
                thisGrade="F";
            }
            letterGrade = thisGrade;
            return letterGrade;
    }
    
    public void setGPA(double english, double math, double science, double arts, double social)
    {
        this.studentGrades[0]=english;
        this.studentGrades[1]=math;
        this.studentGrades[2]=science;
        this.studentGrades[3]=arts;
        this.studentGrades[4]=social;
    }
    
    /*   how to return array?
    public double printGPA()
    {
        return studentGrades[];   
    }
    */
   
    public String toString()
    {
        String output = String.format(
            "first name: %s \n last name: %s \n  age: %d \n  average GPA %.2f \n  avereage GPA as letterGrade is :  %s  \n   %.2f, %.2f,%.2f, %.2f, %.2f    ",    fname, lname, age, aveGPA(),getGrade(),studentGrades[0],studentGrades[1],studentGrades[2],studentGrades[3],studentGrades[4]);
        return output;
    }
}//end class MySOng


/*
More upgrades to the Student class! Add method getGrade() to the Student class that will return a String letter grade based on the student’s GPA. 
The method should return (not print) “A” if the GPA is greater than 4.00, “B” if the GPA is greater than 3.00, “C” if the GPA is greater than 2.00, “D” if the GPA is greater than 1.00, and “F” otherwise.
Write a driver class to create two student objects, sets the GPA of the students using the setGPA() method and prints the letter grade of each student. Sample output is shown below:

Student’s First Name is: John
Student’s Last Name is: Doe
Student’s Average GPA is: 4.0
John’s Grade: A
4.0 4.0 4.0 4.0 4.0

Student’s First Name is: John
Student’s Last Name is: Doe
Student’s Average GPA is: 4.0
John’s Grade: A
4.0 4.0 4.0 4.0 4.0
*/






