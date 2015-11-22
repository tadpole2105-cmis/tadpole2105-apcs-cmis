import javax.swing.JOptionPane;
import java.util.Random;
public class StudentApp
{
    public static void main(String[] args)
    {


       

   
       
       
       Student Senior001=new Student(); 
       Student Junior001= new Student("Ron","Weasley",16, {0.0,0.0,0.0,0.0,0.0});
      
        JOptionPane.showMessageDialog(null,Senior001,  "senior:",JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null,Junior001,  "Junior:",JOptionPane.PLAIN_MESSAGE );
    }//end method main
}
