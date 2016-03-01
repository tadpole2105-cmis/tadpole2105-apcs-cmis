public class Undergrad  extends Student
{

    public Undergrad()
    {
        super(name, yob, mob, dob);

    }

    public int CalcTuition(int units)
    {
        int tuition=0;
        tuition=units*300;
        return tuition;
    }

    public String toString()
    {
        return super.toString() + String.format("Hospital:%s\nMedSchool: %s", hospital, schoolName);
    }

}