public class HDTV extends TV implements Digital
{
    private boolean isOn;
    public HDTV()
    {
        super();
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

    public String type()
    {
        return "im an HD 24 million color tv";
    }

    

    public  String connectHDMI()
    {
        return "HDMI cable connected";
    }

}