import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructie3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructie3 extends World
{

    /**
     * Constructor for objects of class Instructie3.
     * 
     */
    public Instructie3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setBackground("Instructies_3.png");
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("escape")) {
            Greenfoot.setWorld(new Menu());
        }
    }
}
