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
        Student Junior001= new Student("Ronald","Weasley",16, 3.4, 2.3, 2.3, 4.0, 3.4);

        Senior001.setGPA(4.0,4.0,4.0,4.0,4.0);
        Junior001.setGPA(0.0,0.0,0.0,0.0,0.0);
       
        JOptionPane.showMessageDialog(null,Senior001,  "senior:",JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null,Junior001,  "Junior:",JOptionPane.PLAIN_MESSAGE );
    }//end method main
}
