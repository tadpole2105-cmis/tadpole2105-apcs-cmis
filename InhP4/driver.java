import java.util.ArrayList;
public class driver
{

    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();

        Undergrad undergrad= new Undergrad("Sara", "Biology", 0);
        Graduate grad= new Graduate("Tin", "Mathematics", 20);
        Postgrad postgrad= new Postgrad("Pawat", "Civil engineering", 1);
        Undergrad undergrad2= new Undergrad("Woody", "Business", 23);
        Graduate grad2= new Graduate("DJ", "Computer Science", 5);
        Postgrad postgrad2= new Postgrad ( "Nam", "Software engineering", 3);

        students.add(undergrad);
        students.add(grad);
        students.add(postgrad);
        students.add(undergrad2);
        students.add(grad2);
        students.add(postgrad2);

        Student[][] studentsArList = new Student[3][2] ;
        int i=0;
        for (int r=0; r < studentsArList.length; r++)
        {
            for (int c=0; c <studentsArList[0].length; c++  )
            {
                studentsArList[r][c] = students.get(i);
                i++;

            }
        }
        for (int r=0; r < studentsArList.length; r++)
        {
            for (int c=0; c <studentsArList[0].length; c++  )
            {
                

                System.out.print(studentsArList[r][c] + "\t\t");
                

            }
            System.out.println("\n");
        }

    }
}
