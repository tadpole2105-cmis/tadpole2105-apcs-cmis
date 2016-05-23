import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Actor
{
    /**
     * Act - do whatever the Lives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int lives=3;
    public void act() 
    {
        setImage(new GreenfootImage("Lives : " + lives, 24 , Color.BLUE, Color.WHITE));
    }  

    public void deductLives()
    {

        lives--;
    }
}
