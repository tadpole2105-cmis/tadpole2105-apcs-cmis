import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.util.List;
import java.util.ArrayList;

/**
 * Wombat. A Wombat moves forward until it can't do so anymore, at
 * which point it turns left. If a wombat finds a leaf, it eats it.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class Adam extends Actor
{
    
    private int applesColleceted;

    public Adam()
    {
        int applesCollected = 0;
    }

    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        if (hitApple()) 
        {
            eatApple();
        }
        jump();
    }

    public void jump()
    {
        if (Greenfoot.isKeyDown("up") )
        {
            if (getY() >=  getWorld().getHeight() -5)
            {
                jump();
            }
        }
    }
 
    public boolean hitApple()
    {
        Actor apple = getOneObjectAtOffset(0, 0, apples.class); //0 x, 0y, directly over apple object
        Actor rApple = getOneObjectAtOffset(0, 0, rottenApples.class);
        if(apple != null) 
        {
            return true;
        }
        else if(rApple != null) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void eatApple()
    {
        Actor apple = getOneObjectAtOffset(0, 0, apples.class);
        Actor rApple = getOneObjectAtOffset(0, 0, rottenApples.class);
        if(apple != null || rApple != null) 
        {
           
            getWorld().removeObject(apple);
            getWorld().removeObject(rApple);
            applesColleceted = applesColleceted + 1; 
        }
    }
   
    /*
    public int getApplesCollected()
    {
        return applesCollected;
    }
     */
}