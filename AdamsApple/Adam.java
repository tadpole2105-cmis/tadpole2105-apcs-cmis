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
    private int ySpeed;
    private int livesLeft=3;
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
        checkObjRight();
        checkObjLeft();
        hitRottenApple();
        hitEnemy();
    }

    public boolean checkObjRight()
    {
        int getSpiteWidth = getImage().getWidth();
        int xDistance = (int) (getSpiteWidth/2);
        Actor rightWall = getOneObjectAtOffset(xDistance, 0, wall.class);
        if (rightWall == null)
        {
            return false;
        }
        else 
        {
            stopAtRightWall(rightWall);
            return true;
        }
    }

    public void stopAtRightWall(Actor rightWall)
    {
        int wallWidth = rightWall.getImage().getWidth();
        int newX = rightWall.getX() -(wallWidth + getImage().getHeight())/2;
        setLocation(newX, getY());

    }

    public boolean checkObjLeft()
    {
        int getSpiteWidth = getImage().getWidth();
        int xDistance = (int) (getSpiteWidth/2);
        Actor leftWall = getOneObjectAtOffset(xDistance - 50, 0, wall.class);
        if (leftWall == null)
        {
            return false;
        }
        else 
        {
            stopAtLeftWall(leftWall);
            return true;
        }
    }

    public void stopAtLeftWall(Actor leftWall)
    {
        int wallWidth = leftWall.getImage().getWidth();
        int newX = leftWall.getX() +(wallWidth + getImage().getHeight())/2;
        setLocation(newX  , getY());

    }

    public void jump()
    {
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2; //getImage 
        boolean onGround = (getY() == groundLevel);
        if (!onGround) // in middle of jump
        {
            ySpeed++; // adds gravity effect
            setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
            if (getY()>=groundLevel) // has landed (reached ground level)
            {
                setLocation(getX(), groundLevel); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
            }
        }
        else // on ground
        {
            if ("space".equals(Greenfoot.getKey())) // jump key detected
            {
                ySpeed = -15; // add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
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

    public void hitRottenApple()
    {
        Actor rApple = getOneObjectAtOffset(0, 0, rottenApples.class);
        if(rApple != null) 
        {
            livesLeft--;//this is for game over only, not for the lives counter
            if (livesLeft>=0)
            {
                GameOver gameover= new GameOver();
                World myWorld = getWorld();
                myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
                Greenfoot.stop();
            }
        }
    }

    public int getLivesLeft()//need to use livesLeft variable in the counter class
    {
        return livesLeft;
    }

    public void eatApple()
    {
        Actor apple = getOneObjectAtOffset(0, 0, apples.class);
        Actor rApple = getOneObjectAtOffset(0, 0, rottenApples.class);
        
        if(apple != null  ) 
        {
            MyWorld world;
            world= (MyWorld)getWorld();
            world.getScore().addScore(); 

            getWorld().removeObject(apple);

        }

        else if (rApple != null)
        {
            MyWorld world;
            world= (MyWorld)getWorld();
            world.getLives().deductLives(); 

            getWorld().removeObject(apple);
            getWorld().removeObject(rApple);

        }


    }

    public void hitEnemy()
    {
        Actor bomb = getOneObjectAtOffset(0, 0, Bomb.class);
        Actor barrel = getOneObjectAtOffset(0, 0, Barrel.class);
        if ( bomb!= null || barrel != null )
        {

            for (int i = 5; i  <= 0 ; i --)
            {
                if (i ==0)
                {
                    MyWorld world;
                    world= (MyWorld)getWorld();
                    world.getLives().deductLives(); 
                }
            }

            getWorld().removeObject(bomb);
            getWorld().removeObject(barrel);

        }
    }

    /*
    public int getApplesCollected()
    {
    return applesCollected;
    }
     */
}