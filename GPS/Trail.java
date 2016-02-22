import java.util.ArrayList;
public class Trail
{
    ArrayList<Integer> markers = new ArrayList<Integer>();
    public Trail()
    {

        markers.add(110);
        markers.add(115);
        markers.add(80);
        markers.add(60);
        markers.add(60);
        markers.add(55);
        markers.add(50);
        markers.add(35);
        markers.add(65);
        markers.add(80);
        markers.add(75);
        markers.add(90);
        markers.add(100);

    }

    public Trail(ArrayList<Integer> markers)
    {
        this.markers=markers;
    }//?????????

    public void addmarker (int newmarker)
    {
        markers.add(newmarker);
    }

    public int getLength()
    {
        int length=0;
        for (int index : markers)
        {
            length++;
        }
        return length;
    }

    public boolean isTrailLevel(int begin, int end)
    {
        boolean result = true;
        for (int i= begin; i < end; i++)
        {
            if (markers.get(begin)==markers.get(end) && Math.abs(markers.get(i)-markers.get(i+1)) < 10)//to get specific slots of arraylist, need to use .get(index), cant just x[index]
            {
                result = true;
            }
            else 
            {
                result = false;
            }
        }
        return result;
    }

    public boolean isTrailHard(int begin, int end)
    {
        boolean result = true;
        int netgain= 0;
        for (int i= begin; i < end; i++)
        {
            netgain+= Math.abs(markers.get(i)-markers.get(i+1)); //difference between each one
        }
        if (isTrailLevel(begin, end) || netgain >= 100)//to get specific slots of arraylist, need to use .get(index), cant just x[index]
        {
            result = true;
        }
        else 
        {
            result = false;
        }
        return result;
    }

    public String toString()
    {
        String output = new String();
        for (int i =0; i < markers.size(); i++) //for arraylist, use .size() not .length
        {
            output+= + i + "\t" + markers.get(i) + "\n";
        }
        return output;
    }
}

