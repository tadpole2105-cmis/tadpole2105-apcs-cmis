public class RosterDriver
{
    public static void main (String[] arg)
    {
        Roster2  apComputerScience =new Roster2(); //pull of Student instance

        //add 3 students
        apComputerScience.addStudent (new Student("Micheal", "Jackson", 12, 3.4));
        apComputerScience.addStudent (new Student("Louis", "Vuiton", 17, 1.4));
        apComputerScience.addStudent (new Student("Darth", "Vader", 34, 3.9));
        
        System.out.println(" before droping" + "\n" + apComputerScience ); 

        //drop 1 student with given lastname 
        apComputerScience.dropStudent (  "Jackson");
        System.out.println( " after droping" + "\n" +  apComputerScience ); 

        

    
    }
}

