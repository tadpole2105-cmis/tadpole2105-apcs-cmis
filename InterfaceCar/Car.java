public class Car extends Vehicle implements Connectable, Discountable
{
    public  int percentDiscount() 
    {
        return 50;
    }
    
    public String connectToBlueTooth()
    {
        return "Connecting to bluetooth for a MyCar";
    }
}