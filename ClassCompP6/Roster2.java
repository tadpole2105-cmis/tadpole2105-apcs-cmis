import java.util.ArrayList;
public class Roster2
{
    private ArrayList<Student> myStudents = new ArrayList<Student>(); //arraylist containing type Student called "myStudents"
    public Roster2()
    {
        myStudents.add(new Student("Norton", "Max", 22, 4.0));
        myStudents.add(new Student("Stevenson","Ingrid",21,2.4));
        myStudents.add(new Student("Songla","Su",15, 3.2));
    }
    public void addStudent ( Student newStudent )
    {
        myStudents.add(newStudent); //add newStudent to myStudents
    
    }
    public void dropStudent ( String lastName ) 
    {
        
        for (int i=0; i < myStudents.length; i ++)//search for student with given lastName
        {
            if (Student.lname.equals(lastName))
            {
                myStudents.remove()//remove student with the given last name 
            }
        }
        
    }

    public String getHighestGPA()
    {
        String highestGPAStudent  = new String();
        for (int i=0; i<myStudents.length-1; i++)
        {
            if (Students[i].GPA>Students[i+1].GPA)//access grade from Students array
            {
                highestGPAStudent=Students[i].lname;//return name of highest GPA
            }
        }
        return highestGPAStudent;

    }

    public String toString()
    {

        String output = new String();
        output = "name of student with highest GPA : " + getHighestGPA();
        return output;
    }

}