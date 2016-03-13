public class Astroidman extends SuperHero
{
    
    private String motto;
    private String capecolor;
    private boolean hascape;
    private String name;
    public String name()
    {
        return "Astroidman";
    }
    public Astroidman()
    {
        super();

    }

    public String createmotto()
    {
        motto= "I love Tadpoleman";
        return motto;
    }
     public boolean isCaped()
    {
        hascape= true;
        return hascape;
    }
    public String capecolor()
    {
        capecolor= "Brilliant pink";
        return capecolor; 
    }
    
//     public String toString()
//     {
//         return super.toString() + String.format("name:%s\n color:%s \n can buy w/out gadgets? : %B \n upgrades : %s, %s", name, color,option,upgrade1, upgrade2);
//     }
    
}