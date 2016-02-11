public class Doctor extends Person
{
    private String hospital;
    private String schoolName;
    
    public Doctor(String name, int yob, int mob, int dob, String schoolName, String hospital)
    {
        super(name, yob, mob, dob);
        this.hospital=hospital;
        this.schoolName = schoolName;
    }
    
        
    public String toString()
    {
        return super.toString() + String.format("Hospital:%s\nMedSchool: %s", hospital, schoolName);
    }
    
}