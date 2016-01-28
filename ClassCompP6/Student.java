import javax.swing.JOptionPane;
public class Student
{

    private String fname;
    public String lname;
    private int age;
    public double GPA;
    private boolean isThai;

     
    public Student(String fname, String lname, int age, double GPA)
    {
        this.fname= fname;
        this.lname=  lname;	
        this.age= age;
        this.GPA= GPA;
    }

    public Student()
    {
        fname="Lek";
        lname="Wang";
        age=6;
        GPA=3.5;
        isThai=true;;
    }//end userinout constructor 

    public String toString()
    {
        String output = new String();
        output = "Name: " + lname + ", " +fname +"\n" + "Age : "+ age + "\n" + "Is Thai? : " + isThai ;
        return output;
    }
}