public class DeviceApp
{
    public static void main(String[] args)
    {
        MyDevice[] allproducts = new MyDevice[2];
        allproducts[0]=new TadderWrist("Tadder", "Tadpole", "TadderWrist", "black",  "measures heart rate", "senses nearby TadderWrist");
        allproducts[1]=new TadderLens("Tadder", "Tadpole", "TadderLens", "silver, ", "changable internal camera lens", "improved battery life");
        for (MyDevice products : allproducts)
        {
            System.out.println(products + "\n");
        }
    }
}