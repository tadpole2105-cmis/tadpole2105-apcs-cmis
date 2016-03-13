import java.util.ArrayList;
public class driver
{

    public static void main(String[] args)
    {
        ArrayList<TV> tv = new ArrayList<TV>();

        HDTV hdtv= new HDTV();
        BWTV bwtv= new BWTV();

        tv.add(hdtv);
        tv.add(bwtv);

        for(TV tele : tv)
        {
            System.out.println(tele.type() + ",  isOn? " + tele.turnoff());
        }

        System.out.println("\n");

        for(TV tele : tv)
        {
            System.out.println(tele.type() + ",  isOn? " + tele.turnOn());
        }

        System.out.println( hdtv.connectHDMI());
        System.out.println( bwtv.rotateRabbitEars());
    }
}
