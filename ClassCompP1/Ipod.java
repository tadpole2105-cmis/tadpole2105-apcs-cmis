import java.util.ArrayList;
public class Ipod
{
        private String color;
        private int memory;
        private ArrayList<String> songLibrary = new ArrayList<String>();
        String[] songLibrary1= new String [3];// doesnt get used
        public Ipod()
        {
            this.color="Silver";
            this.memory= 16;
            songLibrary.add("song1");
            songLibrary.add("song2");
            songLibrary.add("song3");
        }
        
        public Ipod(String color, int memory, String song,String song1,String song2)
        {
            this.color= color;
            this.memory= memory;
            songLibrary.add(song);
            songLibrary.add(song1);
            songLibrary.add(song2);
        }
       
        public String toString()
        {
        
        String output = new String();
        output = "Color " + color  + "\n" +memory  +"\n" + "Songs: "+"\n" ;
        for (String song : songLibrary)
        {
            output+=song ;
        }
        return output;
        }
    
}
/*
for ( song: songLibrary)
{
    system.out.print song
}
*/