public class Graduate  extends Student
{

    public Graduate()
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
        return super.toString() + String.format();
    }

}