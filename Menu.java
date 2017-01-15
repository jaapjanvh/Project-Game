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
    public final GreenfootImage Instructiebutton= new GreenfootImage("Instructie_button.png");
    private InstructionButton button1;
    private InstructionButton button2;
    private InstructionButton button3;

    public Menu()
    {    
        // Create a new world with gridsize (same as the other worlds)
        // super(PortWorld.gridWidth * PortWorld.gridSize, PortWorld.gridHeight * PortWorld.gridSize, 1);
        super(800, 463, 1);
        prepare(); 
    }

    public void prepare()
    {
        GreenfootImage image = new GreenfootImage("Prachtig3.png");
        // image.scale(PortWorld.gridWidth * PortWorld.gridSize, PortWorld.gridHeight * PortWorld.gridSize); // scaling the original image
        setBackground(image); 

        gameknop1 = new GameKnop();
        addObject(gameknop1,400,140);
        gameknop1.setImage("MiniGame1Button.png");
        
        gameknop2 = new GameKnop();
        addObject(gameknop2,400,240);
        gameknop2.setImage("MiniGame2Button.png");

        gameknop3 = new GameKnop();
        addObject(gameknop3,400,340);
        gameknop3.setImage("MiniGame3Button.png");
        
        button1 = new InstructionButton();
        addObject(button1,530,140);
        Instructiebutton.scale(50,50);
        button1.setImage(Instructiebutton);
        
        button2 = new InstructionButton();
        addObject(button2,530,240);
        button2.setImage(Instructiebutton);
                
        button3 = new InstructionButton();
        addObject(button3,530,340);
        button3.setImage(Instructiebutton);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(gameknop1)) {
            Greenfoot.setWorld(new PortWorld()); 
        }
        if(Greenfoot.mouseClicked(gameknop2)) {
            Greenfoot.setWorld(new MiniGame2()); 
        }
        if(Greenfoot.mouseClicked(gameknop3)) {
            Greenfoot.setWorld(new TegelWorld()); 
        }
        if(Greenfoot.mouseClicked(button1)) {
            Greenfoot.setWorld(new Instructie1()); 
        }
        if(Greenfoot.mouseClicked(button2)) {
            Greenfoot.setWorld(new Instructie2()); 
        }
        if(Greenfoot.mouseClicked(button3)) {
            Greenfoot.setWorld(new Instructie3()); 
        }
    }
}
