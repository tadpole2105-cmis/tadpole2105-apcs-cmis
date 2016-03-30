import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class wall extends Actor
{
    int randomRemoveTime = (int)(Math.random()*10);
    public wall()//create wall at ramdom spaces
    {

    }

    public void act()
    {
        //appear();
        remove();
    }

    public void remove()
    {
        while (true)
        {
            if (Greenfoot.getRandomNumber(2) == 1)
            {
                getWorld().addObject(new wall(),Greenfoot.getRandomNumber(getWorld().getWidth()), 350);
            }
            /*
            if (Greenfoot.getRandomNumber(5) == 1)

            {
                getWorld().removeObject(this);
            }
            */
        }

    }
}
