import java.util.ArrayList;
public class FamilyMembers
{
    public static void main (String[] args)
    {
        ArrayList<String> FamilyMember = new ArrayList<String>();

        FamilyMember.add("Wichai Kajonpredanon");
        FamilyMember.add("Pocanie Kajonpredanon");
        FamilyMember.add("Tetach Kajonpredanon");

        System.out.println("There are " +  FamilyMember.size() + "in the array list" + "\n" + "The members in the family are (for each loop)" );
        for (String member : FamilyMember)
        {
            System.out.println(member );
        }

        System.out.println("normal for loop");

        for (int i = 0; i < FamilyMember.size(); i++ )
        {
            System.out.println( FamilyMember.get(i));
        }
    }

}
/*
for ( song: songLibrary)
{
system.out.print song
}
 */