import javax.swing.JOptionPane;
public class StudentApp
{
    public static void main(String[] args)
    {
       
    
        Student Senior001=new Student(); 
        Student Junior001= new Student("Ron","Weasley",16, false);
        
        
        JOptionPane.showMessageDialog(null,Senior001,  "senior:",JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null,Junior001,  "Junior:",JOptionPane.PLAIN_MESSAGE );
    }//end method main
}
