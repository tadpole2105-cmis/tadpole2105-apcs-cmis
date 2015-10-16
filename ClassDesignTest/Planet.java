import java.util.Random;
public class Planet
{
   private String Name, Relationship;
   private double Radius, percentSpaceMarines, Spaceperstar,Stardestroyers, Namer;
   private int maxPopulation, maxSpaceMarinesPerStarDestroyer, SpaceMarine;
   private String[] names= { "Beta", "Alpha", "Gamma", "Delta"};
   private String[] status= {"hostile","at war", "neutral", "ally", "fiendly"};
   
    public Planet()
    {
       int randomname= new Random().nextInt(names.length);
       int randomstatus=new Random().nextInt(status.length);
        Name = names[randomname];
        Namer =Math.random();
        Relationship= status[randomstatus];
        Radius=1;
        maxPopulation=1;
        percentSpaceMarines=1.00;
        maxSpaceMarinesPerStarDestroyer=1;
        SpaceMarine=1;
        Stardestroyers=1.00;
        
        
    }//end 0 arg
    public Planet(int maxPopulation, double percentSpaceMarines, int maxSpaceMarinesPerStarDestroyer)
    {
        this.maxPopulation=maxPopulation;
        this.percentSpaceMarines=percentSpaceMarines;
        this.maxSpaceMarinesPerStarDestroyer=maxSpaceMarinesPerStarDestroyer;
        int randomname= new Random().nextInt(names.length);
        int randomstatus=new Random().nextInt(status.length);
        Name = names[randomname];
        Namer =Math.random();
        Stardestroyers=(int)(Math.random()*1000000);
        SpaceMarine=(int)(Math.random()*1000000);
        Relationship= status[randomstatus];
        Radius=Math.random();
    }
    public String toString()
    {
        String result = String.format("Name: %s\t%.2f\n"+
                                       "Relationship: %s\n"+        
                                        "Radius: %f.2\n"+
                                        "Population: %d\n"+
                                        "Space Marines as percent of pop: %.2f\n"+
                                        "Space Marines: %d\n"+
                                        "Star Destroyers: %f\n"+
                                        "Space Marines per star destroyer: %d\n", Name, Namer, Relationship, Radius, maxPopulation, percentSpaceMarines, SpaceMarine, Stardestroyers, maxSpaceMarinesPerStarDestroyer);
        return result;
    }
}
//spacemarine