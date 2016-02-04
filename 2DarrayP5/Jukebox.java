import javax.swing.JOptionPane;
public class Jukebox
{

    String rString = JOptionPane.showInputDialog ("enter row dimension");
    String cString = JOptionPane.showInputDialog ("enter column dimension");
    int c = Integer.parseInt (cString);
    int r = Integer.parseInt (rString);
    MySongs[][] songlist = new MySongs[c][r] ;

    public Student()
    {
        fname="Lek";
        lname="Wang";
        age=6;
        GPA=3.5;
        isThai=true;;
    }

    for (int rows=0; rows < songlist.length; rows++)
    {
        for (int col=0; col < songlist[0].length; col++)
        {

            songlist[rows][col]= ;

        }

        System.out.print( "\n"  );
    }

}