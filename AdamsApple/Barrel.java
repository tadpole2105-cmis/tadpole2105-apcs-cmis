import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrel extends Enemy
{
    /**
     * Act - do whatever the Barrel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fall();	
        remove();
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
}
