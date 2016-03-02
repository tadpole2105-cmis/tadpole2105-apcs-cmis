public class Graduate  extends Student
{

    public Graduate(String name, String major, int units)
    {
        super(name, major, units);
    }

    public int CalcTuition(int units)
    {
        int tuition=0;
        tuition=units*500;
        return tuition;
    }

    public String toString()
    {
        return "grad ; " + super.toString() ;
    }

}