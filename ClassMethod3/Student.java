import javax.swing.JOptionPane;
public class Student
{
    

    private String fname;
    private String lname;
    private int age;
    
    private double[] studentGradesEmpty= new double[5];
    private double[] studentGradesSubjects= {english, math, science, arts, social};
    
    
    private double A=4.00;
    private  double Am=3.70;
    private  double Bp=3.30;
    private  double B=3.00;
    private  double Bm=2.70;

    
    
    //these are the random grades (0.0 -4.0) for each subject that will be put into the setter method 
    private double english = Math.random()*4;
    private double math = Math.random()*4;
    private double science = Math.random()*4;
    private double arts = Math.random()*4;
    private double social = Math.random()*4;
    
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
    
    
    
    public double getGrades()
    {
        double[] studentGrades ={this.A, this.Am, this.Bp, this.B, this.Bm };
        return studentGrades;
    } //put values of grades A, Am.... into each slot of studentGrades array
     
    public Student()
    {
       fname="Lek";
       lname="Wang";
       age=6;
       for (int i=0; i<studentGrades.length; i++)
       {
           studentGrades[i]=0.0;
       }//set all slots of studentGrades array to 0.0
    }//end single arg constructor 
    
    
    
    public Student(String fname, String lname, int age, double grades)///put array in muti agr?
    {
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        for (int i=0; i<studentGrades.length; i++)
       {
           this.grades=grades;
           studentGrades[i]=grades; // put grades from multi arg into each slots of studentGrades array 
       }//set all slots of studentGrades array to 0.0
        this.grades=grades;
    }//end multi arg 
    
    
    public void setgrades(double newgrade)
    {
         for (int i=0; i<studentGrades.length; i++)
         {
             if (studentGrades[i]<=4.0 && studentGrades[i]>3.70)
             {
                 studentGrades[i]= "A";            
             }
             else if (studentGrades[i]<=3.70 && studentGrades[i]>3.30)
             {
                 studentGrades[i]= "Am";            
             }
             else if (studentGrades[i]<=3.30 && studentGrades[i]>3.00)
             {
                 studentGrades[i]= "Bp";            
             }
             else if (studentGrades[i]<=3.0 && studentGrades[i]>2.70)
             {
                 studentGrades[i]= "B";            
             }
             else
                 studentGrades[i]= "Bm";
         }
    }
    
    
    public String toString()
    {
        String output = new String();
        output = "Name: " + lname + ", " +fname +"\n" + "Age : "+ age + "\n" + "Grade : " + grades ;
        return output;
    }
}//end class MySOng