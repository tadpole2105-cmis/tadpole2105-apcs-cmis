public class Roster
{
        
        String[] Students= new String [3];
       
        public Roster()//populte Students array
        {
            Students[0]=Student("Norton", "Max", 22, 4.0);
            Students[1]=Student("Stevenson","Ingrid",21,2.4);
            Students[2]=Student("Songla","Su",15, 3.2);
        }
        
       public String getHighestGPA()
       {
        String highestGPAStudent;
        for (int i=0; i<Students.length; i++)
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
        output = "name of student with highest GPA : " + gethighestGPA();
        return output;
        }
    
}