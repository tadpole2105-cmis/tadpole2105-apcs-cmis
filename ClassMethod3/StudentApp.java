import javax.swing.JOptionPane;
import java.util.Random;
public class StudentApp
{
    public static void main(String[] args)
    {


       

       //these are the random grades (0.0 -4.0) for each subject that will be put into the setter method 
    double english = Math.random()*4;
    double  math = Math.random()*4;
    double  science = Math.random()*4;
    double arts = Math.random()*4;
    double social = Math.random()*4;
    
       
       
       Student Senior001=new Student(); 
       Student Junior001= new Student("Ron","Weasley",16, english, math, science, arts, social);
      
        JOptionPane.showMessageDialog(null,Senior001,  "senior:",JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null,Junior001,  "Junior:",JOptionPane.PLAIN_MESSAGE );
    }//end method main
}
