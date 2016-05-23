import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int score =0;
    
    
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + score, 24 , Color.GREEN, Color.WHITE));
       
    }    
    
   
    
    public void addScore()
    {
        score= score +5 ;
    }
    
    
}

