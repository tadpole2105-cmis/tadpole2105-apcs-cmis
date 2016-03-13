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

        System.out.println(" all heroes \n");
        for ( SuperHero hero : allHeroes )
        {
            System.out.println( hero.name() + "   " + hero.createmotto());
        }
        //array of all heroes is called allHeroes
        SuperHero[][] capedhero = new SuperHero[3][3] ; 
        int i = 0;

        System.out.println(" \n allHeroes arraylist after removing ones w cape \n");
        for (int r=0; r < capedhero.length; r++)
        {
            for (int c=0; c < capedhero[0].length; c++  )
            {
                if (i< allHeroes.size())
                {
                    if (allHeroes.get(i).isCaped()==true)
                    {
                        capedhero[r][c]=allHeroes.get(i);
                        allHeroes.remove(allHeroes.get(i));
                    }
                    else
                    {
                        i++;
                    }
                }
            }
            //capedhero[r][c]= ""; 
        }

        for(int r = 0; r < capedhero.length; r++)
        {
            for(int c = 0; c < capedhero[0].length; c++)
            {
                if(capedhero[r][c] != null)
                {
                    System.out.print(capedhero[r][c].name() + "\t");
                }
                else
                {
                    System.out.print(capedhero[r][c] + "\t");
                }

            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" removed heroes from allheroes arraylist \n");
        for(int r = 0; r < capedhero.length; r++)
        {
            for(int c = 0; c < capedhero[0].length; c++)
            {
                if(capedhero[r][c] != null)
                {
                    System.out.print(capedhero[r][c].name() + "\t");
                }
            }
            System.out.println();
        }
        /*
        if (hero.isCaped())//iscaped() returns whatever boolean setCape sets (t or f)
        {
        capedhero[r][c] = hero;
        allHeroes.remove(hero);

        }//has cape?
         */
        System.out.print( "\n"  );
    }

}

