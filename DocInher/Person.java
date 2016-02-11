
public class Person
{
    private String name;
    private int yob,mob,dob;
    
    public Person(String name, int yob, int mob, int dob)
    {
        this.name = name;
        this.yob=yob;
        this.mob=mob;
        this.dob=dob;
    }

    public String toString()
    {
        return String.format("Name: %s\n DOB : %d , %d , %d  \n", name, yob, mob, dob);
    }

}
