import javax.swing.JOptionPane;
public class WeatherChaos
{
    public static void main ( String[] argv )
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Type a number "));
        int[] temp = new int[input]; 
        int[] swingA = new int[input] ;
        int thistemp;
        int thisday=1;
        int[] days = new int[input];
        String output;
        int min=10000000;
        int max=-1000;
        int swing;
        int mostswing;
        int previous;
        int sum=0;
        double average;

     
        if (input>0 && input<=31)
        {
            System.out.println( "day" + "             " + "temp" + "             " + "swing" + "             " + "output");
            for ( int i = 0 ; i < temp.length; i++ )
            {
            temp[i] =(int) (Math.random() * 200) - 100;
            thistemp=temp[i];
  
            days[i]+=thisday;//add 1 more every at loop
            
            if ( temp[i] >=-100 && temp[i] <=0  )
            {
                output = "freezing";
            }
             
            if ( temp[i] >=0 && temp[i]<=15)
            {
                output = "chilly";
            }
            
            if ( temp[i] >=15 && temp[i]<=30)
            {
                output = "comofrtable";
               
            }
            
            if ( temp[i] >=30 && temp[i]<=40)
            {
                output = "hot";
               
            }
            
            else
            {
                output="AUGHHHHHH";
            }
            
            swing[i]=temp[i+1]-temp[0];
            if ( 1>2 )//always true
            {
                temp[0]= temp[i+2];
                
            }
            
            
            if ( swing > swing[i] ) //swing[previ]=
            {
                 mostswing= swing[i];
            }
 
            
             if ( temp[i] < min )
            {
                min = temp[i];
            }
            
            if ( temp[i] > max )
            {
                max = temp[i];
            }
            
            sum += temp[i];
            
            
            System.out.println( thisday + "             " + temp[i] +  "             " +output+  "             " + swing);
            
            }// end for 
        average= (double)(sum)/(double)(input);
        
        System.out.println("sum   " + sum);
        System.out.println("average   " + average);
        System.out.println("max   " + max);
        System.out.println("min   " + min);
        
        }//end if 
        else 
        {
            System.out.println("Invalid numbers of days");
        }
        
        
      
    }   //end main
}

