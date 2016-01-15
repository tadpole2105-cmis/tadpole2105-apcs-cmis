import java.util.ArrayList;
public class Ipod
{
        private String color;
        private int memory;
        private ArrayList<String> songLibrary = new ArrayList<String>();
        private String[] songLibrary1= new String [3];
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
            this.songLibrary1[0]= song;
            this.songLibrary1[1]= song1;
            this.songLibrary1[2]= song2;
        }
       
        public String toString()
        {
        String output = new String();
        output = "Color " + color  + "\n" +memory  +"\n" + "Songs: "+ songLibrary + "\n";
        return output;
        }
    
}
/*
for ( song: songLibrary)
{
    system.out.print song
}
*/