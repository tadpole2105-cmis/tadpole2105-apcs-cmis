public class PersonApp
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];
        people[0] = new Person("Nathan Kieffer", 1975, 4, 23);
        people[1] = new Doctor("Bradley Shank", 1943, 9, 21, "John Hopkins", "Chiang Mai Ram");
        for ( Person person : people )
        {
            System.out.println(person + "\n");
        }     
    }
}