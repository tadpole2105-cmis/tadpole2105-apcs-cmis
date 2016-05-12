import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class rottenApples extends Actor
{

    public rottenApples()
    {

    }

    public void act()
    {
        fall();
        remove();
    }

    public void fall()
    {
        move(2);
        setLocation(getX(), getY()+1);
        int randomTurn= (int) (Math.random()*70);
        if(getX() <= 5 || getX() >= getWorld().getWidth() -5)
        {
            turn( randomTurn );

        }

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