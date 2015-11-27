import javax.swing.JOptionPane;
import java.util.Scanner;
public class Student
{
    

    private String fname;
    private String lname;
    private int age;
    
    private double[] studentGrades= new double[5];
    //private double[] studentGradesSubjects= {english, math, science, arts, social};
    
    
    private double A=4.00;
    private  double Am=3.70;
    private  double Bp=3.30;
    private  double B=3.00;
    private  double Bm=2.70;

    
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
    //////////////////////////// might not use  
    /*
    public double getGrades()
    {
        double[] studentGrades ={this.A, this.Am, this.Bp, this.B, this.Bm };
        return studentGrades;
    } //put values of grades A, Am.... into each slot of studentGrades array before returning
    //////////////// 
    */
    
    
    
    
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
        aveGPA= totalGPA /5;
        return aveGPA;
    }

    public String toString()
    {
        String output = String.format(
            "first name: %s \n last name: %s \n  age: %d \n  average GPA %.2f \n",    fname, lname, age, aveGPA());
        return output;
    }
}//end class MySOng