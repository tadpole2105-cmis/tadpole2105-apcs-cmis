import javax.swing.JOptionPane;
public class Jukebox
{

    int r= 3;
    int c = 4;
    MySong[][] songList = new MySong[r][c] ;
    //my song object contains 1 string, 1 int. 
    public Jukebox()
    {
        songList[0][0] = new MySong( "Jet Airliner", 5 );
        songList[0][1] = new MySong( "Slide", 4 );
        songList[0][2] = new MySong( "Tom Sawyer", 3 );
        songList[0][3] = new MySong( "Purple Rain", 2 );
        songList[1][0] = new MySong( "Sing a Song", 1 );
        songList[1][1] = new MySong( "Baba O'Riley", 5 );
        songList[1][2] = new MySong( "Jumper", 4 );
        songList[1][3] = new MySong( "Car Wash", 3 );
        songList[2][0] = new MySong( "Kung Fu Fighting", 2 );
        songList[2][1] = new MySong( "Right as Rain", 4 );
        songList[2][2] = new MySong( "Beat It", 5 );
        songList[2][3] = new MySong( "Bust a Move", 4 );

    }

    public MySong randomSong()
    {
        int randomrow = (int) (Math.random()*(r));
        int randomcol=  (int) (Math.random()*(c));
        return Jukebox.songList[randomrow][randomcol];
    }

    public String toString()
    {
        String output = new String();
        for (int[] rows : songList)
        {
            for (int slot : rows)
            {
                songList[rows][slot]= songList[rows][col];
                output = songList[rows][slot] ;
            }

            System.out.print( "\n"  );
        }

        return output;
    }

}

// for (int rows=0; rows < songList.length; rows++)
//         {
//             for (int col=0; col < songList[0].length; col++)
//             {
// 
//                 songList[rows][col]= songList[rows][col];
//                 output = songList[rows][col] ;
//             }
// 
//             System.out.print( "\n"  );
//         }