import greenfoot.*;


public class Ship extends Mover
{
    /**
     * Creates a new ship
     */
    public Ship()
    {
        setMovementSpeed(2);
        setGravity(0);
        // Set the objects this ship can not go through.
        setBlockingClasses(  new Class[]{Grass.class}  );
        GreenfootImage ship = getImage();
        ship.scale(ship.getWidth() - 150, ship.getHeight() - 150);
        setImage(ship); 

    }
    
    /**
     * Check for key presses that signal movements
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(0);
            move(1);
        }
              
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(180);
            move(1);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(270);
            move(-1);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(90);
            move(1);
        }
    }    
}
