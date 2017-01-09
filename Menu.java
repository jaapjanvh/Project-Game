import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Menu extends World

{
    /**
     * Constructor for objects of class Menu.
     * 
     */
    private GameKnop gameknop1;
    private GameKnop gameknop2;
    private GameKnop gameknop3;
    private GameKnop gameknop4;

    public Menu()
    {    
        // Create a new world with gridsize (same as the other worlds)
        // super(PortWorld.gridWidth * PortWorld.gridSize, PortWorld.gridHeight * PortWorld.gridSize, 1);
        super(800, 463, 1);
        
        prepare(); 
    }

    public void prepare()
    {
        GreenfootImage image = new GreenfootImage("Prachtig2.png");
        // image.scale(PortWorld.gridWidth * PortWorld.gridSize, PortWorld.gridHeight * PortWorld.gridSize); // scaling the original image
        setBackground(image); 

        gameknop1 = new GameKnop();
        addObject(gameknop1,400,140);
        
        gameknop2 = new GameKnop();
        addObject(gameknop2,400,285);
        //gameknop2.setImage("C:/Users/JaapJan/Documents/Project Game/Project-Game/images/Screenshot_3.png");

        gameknop3 = new GameKnop();
        addObject(gameknop3,400,390);
        //gameknop3.setImage("C:/Users/JaapJan/Documents/Project Game/Project-Game/images/Screenshot_4.png");
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(gameknop1)) {
            Greenfoot.setWorld(new PortWorld()); 
        }
        if(Greenfoot.mouseClicked(gameknop2)) {
            Greenfoot.setWorld(new PortWorld()); 
        }
        if(Greenfoot.mouseClicked(gameknop3)) {
            Greenfoot.setWorld(new PortWorld()); 
        }
    }
}
