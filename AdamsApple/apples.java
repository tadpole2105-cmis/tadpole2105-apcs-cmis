import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class apples extends Actor
{

    public apples()
    {

    }

    public void act()
    {
        fall();
        remove();//add score before removing
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
