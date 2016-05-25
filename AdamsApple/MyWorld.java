import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    Score score = new Score();
    Lives lives = new Lives();
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        act();
    }

    public Score getScore()
    {
        return score;
    }
    
    public Lives getLives()
    {
        return lives;
    }
    
    
    
    public boolean counter()
    {
        if(count > 0)//count==1
        {
            count--; //count becomes0
        }
        return count == 0; //count is 0 which is true threfore statement is true
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        wall wall = new wall();
        addObject(wall,254,345);
        apples apples = new apples();
        addObject(apples,328,160);
        rottenApples rottenapples = new rottenApples();
        addObject(rottenapples,155,73);
        Adam adam = new Adam();
        addObject(adam,387,371);
        wall.setLocation(255,353);
        // Counter counter = new Counter();
        // addObject(counter,45,37);
        // counter.setLocation(62,30);
        addObject(score,100,40);
        addObject(lives,300, 40);
    }
    private int shorttime = 1;// for apple
    private int longtime = 0;// for rottenA
    private int count = 1;
    public void act() 
    {
        if(longtime==0) //always true
        {
            rottenApples d1 = new rottenApples();//create new rottenA
            Bomb bomb = new Bomb();
            Barrel barrel = new Barrel();
            
            addObject(d1, (int)(Math.random()*400) + 1, 0);//put it in a random x coordinate
            addObject(bomb, (int)(Math.random()*400) + 1, 0);
            addObject(barrel, (int)(Math.random()*400) + 1, 0);
            
            longtime = 200; //frequency of appearance; lower num= more frequent 
            count = 1; //y set again
        }
        if(true)//from counter?
        {
            longtime--;
            count = 1;
        }
        if(shorttime==1)
        {
            apples d1 = new apples();
            addObject(d1, (int)(Math.random()*400) + 1, 0);
            shorttime = 200;
            count = 1;
        }
        if(true)
        {
            shorttime--;
            count = 1;
        }

    }    

    

    
}    

