import javax.swing.JOptionPane;
public class Pencil
{

    private String color ;
    private boolean hasEraser ;

     
    public Pencil(String color, boolean hasEraser)
    {
        this.color = color;
        this.hasEraser= hasEraser;

    }

    public Pencil()
    {
        this.color= "brown" ;
        this.hasEraser= false ;
    }//end userinout constructor 

    public String toString()
    {
        String output = new String();
        output = "This pencil is " + color + "\n" + "has eraser? : " + hasEraser ; 
        return output;
    }
}