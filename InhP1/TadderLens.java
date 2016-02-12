public class TadderLens extends MyDevice
{
    private String name;
    private String color;
    private boolean option;
    private String upgrade1;
    private String upgrade2;

    public TadderLens(String productline, String developer,String name, String color, boolean option, String upgrade1, String upgrade2)
    {
        super(productline, developer);
        this.name=name;
        this.color=color;
        this.option=option;
        this.upgrade1=upgrade1;
        this.upgrade2 = upgrade2;
    }

    public String toString()
    {
        return super.toString() + String.format("name:%s\n color:%s \n can buy w/out gadgets? : %B \n upgrades : %s, %s", name, color,option,upgrade1, upgrade2);
    }
    
}