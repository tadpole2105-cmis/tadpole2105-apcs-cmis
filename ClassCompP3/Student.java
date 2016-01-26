import javax.swing.JOptionPane;
public class Student
{
    

    private String fname;
    private String lname;
    private int age;
    private boolean isThai;
     
    
     
    public Student(String fname, String lname, int age, boolean isThai)
    {
        this.fname= fname;
        this.lname=  lname;
        this.age= age;
        this.isThai= isThai;
    }//end constructor
    
    public Student()
    {
       fname="Lek";
       lname="Wang";
       age=6;
       isThai=true;;
    }//end userinout constructor 
    
    public String toString()
    {
        String output = new String();
        output = "Name: " + lname + ", " +fname +"\n" + "Age : "+ age + "\n" + "Is Thai? : " + isThai ;
        return output;
    }
}