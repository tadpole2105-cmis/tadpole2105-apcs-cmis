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
        /*
        else if (hitApple()) 
        {
            eatApple();
        }
        */
    }

    /*
    
    public boolean hitApple()
    {
        Actor apple = getOneObjectAtOffset(0, 0, Apple.class); //0 x, 0y, directly over apple object
        if(apple != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void eatApple()
    {
        Actor apple = getOneObjectAtOffset(0, 0, apple.class);
        if(apple != null) 
        {
            // eat the leaf...
            getWorld().removeObject(apple);
            applesColleceted = applesColleceted + 1; 
        }
    }
   
  
    public int getApplesCollected()
    {
        return applesCollected;
    }
     */
}