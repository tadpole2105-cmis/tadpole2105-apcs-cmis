import java.util.ArrayList;
public class driver
{

    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        Undergrad undergrad= new Undergrad("Sara", "biology", 0);
        Graduate grad= new Graduate("Tin", "mathematics", 20);
        Postgrad postgrad= new Postgrad("Pawat", "civil engineering", 1);

        students.add(undergrad);
        students.add(grad);
        students.add(postgrad);

        Student[][] studentsArList = new Student[2][3] ;
        
        
        
        
        
        for (int r=0; r < studentsArList.length; r++)
        {
            for (int c=0; c <studentsArList[0].length; c++  )
            {
                
                        System.out.println(students[c]);
                  


                    
                    //capedhero[r][c]= ""; 
                System.out.println("\n");
            }
        }

    }
}
