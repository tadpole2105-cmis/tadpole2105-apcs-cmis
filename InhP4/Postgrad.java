public class Postgrad extends Graduate
{

    public Postgrad(String name, String major, int units)
    {
        super(name, major, units);
    }

    public int CalcTuition(int units)
    {
        int tuition=0;
        tuition=units*750;
        return tuition;
    }

    public String toString()
    {
        return "post"+super.toString() ;
    }

}