import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class container1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mover extends Actor
{
    private int acceleration = 0;
    private int vSpeed = 0;
    private int containerspeed = 0;  
    private Class[] barrier = new Class[0];
    public boolean vmg2_attached;
    
    public void mg2_MoveCont()
    /*
     * When the hook touches the container and space is pressed and held, it will move with the hook until the spacebar is released.
     */

    {
        MiniGame2 world = (MiniGame2)getWorld();
        if (getOneIntersectingObject(hook.class) != null  && Greenfoot.isKeyDown("space")) 
        { 
            setLocation(world.hook.getX(),world.hook.getY()+55);
        }
    }
    
    public void doGravity()
    {
        if(isTouching(null)){ vSpeed = 0;}
        setLocation(getX(), getY() - vSpeed);
        vSpeed = vSpeed - acceleration;
    }
    
    protected void setMovementSpeed(int newSpeed)
    {
        containerspeed = newSpeed;
    }
    
    protected void setGravity(int g)
    {
        acceleration = g;
    }

    protected void setBlockingClasses(Class[] c)
    {
        barrier = c;
    }  
}
