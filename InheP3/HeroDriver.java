import java.util.ArrayList;
public class HeroDriver
{
    public static void main(String[] args)
    {

        Friedeggman friedeggman1= new Friedeggman();
        friedeggman1.setSuitColor("");
        friedeggman1.isCaped();
        friedeggman1.setCape(true);

        Astroidman astroidman1= new Astroidman();
        astroidman1.isCaped();
        astroidman1.setCape(true);
        astroidman1.setSuitColor("brilliant pink");

        Tadpoleman tadpoleman1= new Tadpoleman();
        tadpoleman1.isCaped();
        tadpoleman1.setCape(true); // must setcape(boolean) before iscaped()
        tadpoleman1.setSuitColor("green");

        ArrayList<SuperHero> allHeroes = new ArrayList<SuperHero>();
        allHeroes.add(friedeggman1);
        allHeroes.add(astroidman1);
        allHeroes.add(tadpoleman1);

        
        for ( SuperHero hero : allHeroes )
        {
            System.out.println( hero + "   " + hero.createmotto());
        }
        
        
        
        
        
        SuperHero[][] capedhero = new SuperHero[3][3] ; 

        for (int r=0; r < capedhero.length; r++)
        {
            for (int c=0; c < capedhero[0].length; c++  )
            {
                for ( SuperHero hero : allHeroes )
                {
                    if (hero.isCaped())//iscaped() returns whatever boolean setCape sets
                    {
                        capedhero[r][c] = hero;
                        allHeroes.remove(hero);
                    }//has cape?
                    System.out.println(  hero.createmotto());
                }
                //capedhero[r][c]= ""; 

            }
            System.out.print( "\n"  );
        }

    }
}
