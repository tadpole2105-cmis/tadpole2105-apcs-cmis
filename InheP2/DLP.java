
public class DLP extends Television
{
    private String model;
    private double price;
    //     
    //     
    //     public LCD()
    //     {
    //         model=getmodel.();
    //         
    //     }

    public DLP(String model, double price)
    {
        super(model, price);

        this.model=model;
        this.price = price;
    }

    public String toString()
    {
        return super.toString();
    }

}