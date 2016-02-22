import java.util.ArrayList;
public class GPSDriver
{
    public static void main(String[] args)
    {

        Trail trail1= new Trail(); // this is from trail zero arg in class def
        System.out.println("Trail 1:" + "\n" + trail1);
        System.out.println("distance:" + "\t" + trail1.getLength());
        System.out.println("is difficult from begin to end" + "\t" + trail1.isTrailHard(0, trail1.markers.size()-1));
        System.out.println("is difficult from marker 1-4" + "\t" +trail1.isTrailHard(0, 3));
        System.out.println("is level from begin to end" + "\t" + trail1.isTrailLevel(0, trail1.markers.size()-1));
        System.out.println("is level from marker 1-4" + "\t" +trail1.isTrailLevel(0, 3));

        System.out.println("----------------------------------------------");
        
        ArrayList<Integer> trail2markers = new ArrayList<Integer>();
        trail2markers.add(20);
        trail2markers.add(40);
        trail2markers.add(20);
        trail2markers.add(20);
        trail2markers.add(20);
        trail2markers.add(29);
        trail2markers.add(20);
        Trail trail2=new Trail(trail2markers); 
        System.out.println("Trail 2:" + "\n" + trail2);
        System.out.println("distance:" + "\t" + trail2.getLength());
        System.out.println("is difficult from begin to end" + "\t" + trail2.isTrailHard(0, trail2.markers.size()-1));
        System.out.println("is difficult from marker 1-4" + "\t" +trail2.isTrailHard(0, 3));
        System.out.println("is level from begin to end" + "\t" + trail2.isTrailLevel(0, trail2.markers.size()-1));
        System.out.println("is level from marker 1-4" + "\t" +trail2.isTrailLevel(0, 3));
        
        System.out.println("----------------------------------------------");
         
        ArrayList<Integer> trail3markers = new ArrayList<Integer>();
        trail3markers.add(10);
        trail3markers.add(1000);
        trail3markers.add(200);
        trail3markers.add(10);
        trail3markers.add(23);
        Trail trail3=new Trail(trail3markers); 
        System.out.println("Trail 3:" + "\n" + trail3);
        System.out.println("distance:" + "\t" + trail3.getLength());
        System.out.println("is difficult from begin to end" + "\t" + trail3.isTrailHard(0, trail3.markers.size()-1));
        System.out.println("is difficult from marker 1-4" + "\t" +trail3.isTrailHard(1, 3));
        System.out.println("is level from begin to end" + "\t" + trail3.isTrailLevel(0, trail3.markers.size()-1));
        System.out.println("is level from marker 1-4" + "\t" +trail3.isTrailLevel(1, 3));
        
        
 
    }//end method main
}
//System.out.println("" + "\t" +);
//trail1.isTrailHard()