public class Roster
{
        
        String[] Students= new String [];
        public Roster()
        {
            Students[0]=Student();
            Students[1]=Student();
            Students[2]=Student();
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