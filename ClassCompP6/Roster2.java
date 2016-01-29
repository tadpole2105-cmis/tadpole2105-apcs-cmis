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
    
    public  void dropStudent ( String lastName ) 
    {
        
        for (int i=0; i < myStudents.size(); i ++)//search for student with given lastName
        {
            if (myStudents.get(i).lname.equals(lastName))//myStudents.get(i) is getting Students instances inside arraylist
            {
                myStudents.remove(myStudents.get(i));//remove student with the given last name 
            }
        }
        
    }

 
    public String toString()
    {
        String output = new String();
        for ( Student e : myStudents)
        {
            output+=e; 
        
        }
        return output;
    }

}
  /*
    public String getHighestGPA()
    {
        String highestGPAStudent  = new String();
        for (int i=0; i<myStudents.size()-1; i++)
        {
            if (Students[i].GPA>Students[i+1].GPA)//access grade from Students array
            {
                highestGPAStudent=Students[i].lname;//return name of highest GPA
            }
        }
        return highestGPAStudent;

    }
     */