import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallingObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Actor
{
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public abstract void fall();
    public abstract void remove();
}
