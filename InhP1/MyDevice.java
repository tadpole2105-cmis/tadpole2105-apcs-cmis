
public class MyDevice
{
    private String productline, developer;
     
    public MyDevice(String productline, String developer)
    {
        this.productline = productline;
        this.developer=developer;
        
    }

    public String toString()
    {
        return String.format("Product line: %s\n uses : %s \n developed by %s ", productline,  developer);
    }
}
