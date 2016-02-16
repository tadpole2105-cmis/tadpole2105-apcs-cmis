public class Astroidman extends SuperHero
{
    

    public Astroidman()
    {
        super();

    }

    public String toString()
    {
        return super.toString() + String.format("name:%s\n color:%s \n can buy w/out gadgets? : %B \n upgrades : %s, %s", name, color,option,upgrade1, upgrade2);
    }
    
}