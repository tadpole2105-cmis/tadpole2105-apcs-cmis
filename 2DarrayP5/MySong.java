
public class MySong
{
    private String title;
     int rating;
    MySong (String title, int rating)
    {
        this.title= title;
        this.rating= rating;
    }
    
    public String toString()
    {
        String output = new String();
        output =
        "Song title: " + title + "\t" +
        "Rating: " + rating + "\n";
        return output;
    }
}

