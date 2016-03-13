public class TadderWrist extends MyDevice
{
    private String name;
    private String color;
    private String upgrade1;
    private String upgrade2;

    public TadderWrist(String productline, String developer,String name, String color, String upgrade1, String upgrade2)
    {
        super(productline, developer);
        this.name=name;
        this.color=color;
        this.upgrade1=upgrade1;
        this.upgrade2 = upgrade2;
    }

    public String toString()
    {
        return super.toString() + String.format("name:%s\n color:%s  \n upgrades : %s, %s", name, color,upgrade1, upgrade2);
    }
    
}