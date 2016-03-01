public class Postgrad extends Graduate
{

    public Postgrad()
    {
        super();

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