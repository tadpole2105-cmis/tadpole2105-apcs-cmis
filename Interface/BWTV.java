public class BWTV extends TV implements Analog
{
    private boolean isOn;
    
    public BWTV()
    {
        super();
    }

    public String rotateRabbitEars()
    {
        return "Rabbit ears rotated 45 degrees";
    }

    public String type()
    {
        return "im a b&w tv";
    }

    public boolean turnOn()
    {
        isOn=true;
        return isOn;
    }

    public boolean turnoff()
    {
        isOn=false;
        return isOn;

    }

}