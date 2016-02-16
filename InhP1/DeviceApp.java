public class DeviceApp
{
    public static void main(String[] args)
    {
        MyDevice[] allproducts = new MyDevice[2];
        allproducts[0] = new MyDevice("Tadder","Tadpole");
        allproducts[1]=new TadderWrist("Tadder", "Tadpole", "TadderWrist", "black", false, "measures heart rate", "senses nearby TadderWrist");
        allproducts[2]=new TadderLens("Tadder", "Tadpole", "TadderLens", "silver, ", true, "changable internal camera lens", "improved battery life");
        for (MyDevice products : allproducts)
        {
            Systems.out.println(products);
        }
    }
}