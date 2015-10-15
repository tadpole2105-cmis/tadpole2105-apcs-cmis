import javax.swing.JOptionPane;
public class Cubiverse
{
    private int w;
    private int h;
    private int d;
    private double x;
    private double y;
    private double z;
    private int volume;
    private String name;
    private double dl;
    private double db;
    private double dbo;
    public Cubiverse()
    {
        name="Default Cubiverse";
        w=1;
        h=1;
        d=1;
        volume=w*h*d;
        x=0.50;
        y=0.50;
        z=0.50;
        dl=0.50;
        db=0.50;
        dbo=0.50;
    }
//volume in output
    public Cubiverse( int w, int h, int d, String name)
    {
        this.w=w;
        this.h=h;
        this.d=d;
        this.name=name;
        this.volume=w*h*d;
        x=0.50;
        y=0.50;
        z=0.50;
        dl=0.50;
        db=0.50;
        dbo=0.50;
    }
    
    public Cubiverse( double x, double y, double z, String name)
    {
        this.w=1;
        this.h=1;
        this.d=1;
        this.name=name;
        this.volume=w*h*d;
        this.x=x;
        this.y=y;
        this.z=z;
        dl=Math.random();
        db=Math.random();
        dbo=Math.random();
    }

    public String toString()
    {
        String output = new String();
        output = name + "\n"+ "w :"+ w+ "\n" + "h: " + h + "\n" + "d; " + d + "\n" + "volume" +volume+ "\n" + "x: " + x+ "\n" + "y: " + y+"\n"+ "z: " +z + "\n" + "distance from left:" + dl +"\n"+ "distance from back" + db +"\n"+ "distance from bottom"+ dbo +"\n"; 
        return output;
    }
}