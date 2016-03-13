public abstract class TV 
{
    private boolean isOn;
    
    public abstract String type();
    
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
