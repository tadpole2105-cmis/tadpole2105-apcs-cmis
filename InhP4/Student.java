
public abstract class Student 
{
     String name;
     String major;
     int units;
    
    public Student(String name, String major, int units)
    {
        this.name=name;
        this.major=major;
        this.units=units;
    }

    
    abstract public int CalcTuition(int units);

    public String toString()
    {
        return String.format("name: %s, major %s, units taken: %d", name, major, units);
    }

    

}
