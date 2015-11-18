import javax.swing.JOptionPane;
public class Student
{
    

    private String fname;
    private String lname;
    private int age;
    
    
    private double A=4.00;
    private  double Am=3.70;
    private  double Bp=3.30;
    private  double B=3.00;
    private  double Bm=2.70;

    
    
    
    
    public void grades (double A, double Am, double Bp, double B, double Bm)
     {
        this.A=A;
        this.Am=Am;
        this.Bp=Bp;
        this.B=B;
        this.Bm=Bm;
     }
    

    
    public Student()
    {
       fname="Lek";
       lname="Wang";
       age=6;
       grades=0.0;
    }//end userinout constructor 
    
    public String toString()
    {
        String output = new String();
        output = "Name: " + lname + ", " +fname +"\n" + "Age : "+ age + "\n" + "Is Thai? : " + isThai ;
        return output;
    }
}//end class MySOng