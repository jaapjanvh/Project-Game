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
    //public static boolean vmg2_containerdown;
    //public static boolean vmg2_containerup;
    //public static boolean vmg2_containerright;
    //public static boolean vmg2_containerleft;
    public boolean vmg2_down1;
    public boolean vmg2_up1;
    public boolean vmg2_right1;
    public boolean vmg2_left1; 
    //MiniGame2 world = (MiniGame2)getWorld();
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
    
    public void mg2_MoveCont1()
    {
        GreenfootImage image = getImage();
        MiniGame2 world = (MiniGame2)getWorld();
        if (getOneIntersectingObject(hook.class) != null && world.hook.vmg2_hooked == false)
        {
            if (vmg2_right1 == true )
            {
                setLocation(world.hook.getX(),world.hook.getY()+55);
                world.hook.vmg2_hooked = true;
            }
            if (vmg2_left1 == true)
            {
                setLocation(world.hook.getX(),world.hook.getY()+55);
                world.hook.vmg2_hooked = true;
            }
            else
            {
                setLocation(this.getX(),this.getY());
            }
            if (vmg2_up1 == true)
            {
                setLocation(world.hook.getX(),world.hook.getY()+55);
                world.hook.vmg2_hooked = true;
            }
            if (vmg2_down1 == true && world.hook.vmg2_hooked == false)
            {
                setLocation(world.hook.getX(),world.hook.getY()+55);
                world.hook.vmg2_hooked = true;
            }

        }
    }

    protected void setBlockingClasses(Class[] c)
    {
        barrier = c;
    }  
}
