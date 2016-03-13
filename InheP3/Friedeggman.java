public class Friedeggman extends SuperHero
{
    private String motto;
    private String capecolor;
    private boolean hascape;
    private String name;
    
    public Friedeggman()
    {
 
        super();

    }
    public String name()
    {
        return "friedeggman";
    }
    
    public boolean isCaped()
    {
        hascape= false;
        return hascape;
    }
    public String capecolor()
    {
        capecolor= "";
        return capecolor; 
    }
    
    public String createmotto()
    {
        motto= "There's no such thing as sunny side up.";
        return motto;
    }

//     public String toString()
//     {
//         return super.toString() + String.format("", );
//     }
//     
}