public class Undergrad  extends Student
{


    public Undergrad(String name, String major, int units)
    {
        super(name, major, units);
    }
    
    public int CalcTuition(int units)
    {
        int tuition=0;
        tuition=units*250;
        return tuition;
    }

    public String toString()
    {
        return "undergrad " + super.toString() ;
    }

}
//"Name: %s\n DOB : %d , %d , %d  \n", name, yob, mob, dob