public class Tadpoleman extends SuperHero
{

    private String motto;
    private String capecolor;
    private boolean hascape;
    public Tadpoleman()
    {
        super();

    }

    public String createmotto()
    {
        motto = "Only live in clean water";
        return motto;
    }

//     public boolean hascape()
//     {
//         hascape= true;
//         return hascape;
// 
//     }
//     public String capecolor()
//     {
//         capecolor= "green";
//         return capecolor; 
//     }


    //     public String toString()
    //     {
    //         return super.toString() + String.format("name:%s\n color:%s \n can buy w/out gadgets? : %B \n upgrades : %s, %s", name, color,option,upgrade1, upgrade2);
    //     }

}