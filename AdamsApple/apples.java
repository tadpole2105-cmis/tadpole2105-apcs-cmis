import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.*;
import java.util.ArrayList;
public class apples extends Actor
{

    public apples()
    {

    }

    public void act()
    {
        fall();
        remove();//add score before removing
        applesMissed();
    }

    public void fall()
    {
        setLocation(getX(), getY()+1);

    }

    public void remove()
    {

        //Actor rApple = getOneObjectAtOffset(0, 0, rottenApples.class);
        if(getY() >=  getWorld().getHeight() -5)
        {
            getWorld().removeObject(this);

        }
    }

    public void applesMissed()//the more you miss, the more bombs/barrel will fall
    {
        if(getWorld()!= null){
            Enemy bomb = new Bomb();
            Enemy barrel = new Barrel();

            ArrayList<Enemy> fall = new ArrayList<Enemy> ();
            fall.add(bomb);
            fall.add(barrel);

            int counter =0;
            if(getY() >=  getWorld().getHeight() -5)//checks if touching ground
            {
                counter++;
                for (int i= 0; i< counter; i++) //each time missed, i# more of bomb or barrel will fall
                {
                    getWorld().addObject(fall.get((int)(Math.random()*2)), (int)(Math.random()*400) + 1, 0);
                }
            }

        }}
}
