
public abstract class Student 
{
    private String name;
    private String major;
    private int units;
    
    public Student(String name, String major, int units)
    {
        this.name=name;
        this.major=major;
        this.units=units;
    }

    abstract public int CalcTuition(int units);

 

}
