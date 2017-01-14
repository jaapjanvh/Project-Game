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
    MiniGame2 world = (MiniGame2)getWorld();
    public boolean vmg2_attached;
    public void c_move()
    /*
     * When the hook touches the container and space is pressed and held, it will move with the hook until the spacebar is released.
     */

    {
        world = (MiniGame2)getWorld();
        if (getOneIntersectingObject(hook.class) != null  &&Greenfoot.isKeyDown("space")) 
        { 
            setLocation(world.hook.getX(),world.hook.getY()+100);
        }
    }

    public void mg2_MoveCont()
    {
        GreenfootImage image = getImage();
        MiniGame2 world = (MiniGame2)getWorld();
        if (world.hook.vmg2_hooked == true && getOneIntersectingObject(hook.class) != null)
        {
            // (vmg2_attached == true)
            //{
            setLocation(world.hook.getX(),world.hook.getY()+55);  
            //}
            //if (getOneObjectAtOffset(+image.getWidth()/2,0, null) == null && getOneObjectAtOffset(-image.getWidth()/2,0, null) == null)
            //{
            //    setLocation(world.hook.getX(),world.hook.getY()+40);  
            //}
        }
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
                //System.out.println("TESTBRAMMMIEEEEEE");
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

    public void canmove_container()
    {
        GreenfootImage image = getImage(); 
        if (getOneObjectAtOffset(0, image.getHeight()/2, Mover.class) == null) 
        {
            vmg2_down1= true;
        }
        else  
        {
            vmg2_down1 = false;
        }
        if (getOneObjectAtOffset(0, -image.getHeight()/2, Mover.class) == null) 
        {
            vmg2_up1= true;
        }
        else  
        {
            vmg2_up1 = false;
        }
        if (getOneObjectAtOffset(-image.getWidth()/2,0, Mover.class) == null) 
        {
            vmg2_left1= true;
        }
        else  
        {
            vmg2_left1 = false;
        }
        if (getOneObjectAtOffset(+image.getWidth()/2,0, Mover.class) == null) 
        {
            vmg2_right1= true;
        }
        else  
        {
            vmg2_right1 = false;
        }
    }

    public void mg2_TouchContainer()
    {
        GreenfootImage image = getImage();
        Actor abc = getOneObjectAtOffset(0,image.getHeight()/2, Mover.class);
        MiniGame2 world = (MiniGame2)getWorld();
        if (getOneObjectAtOffset(0,image.getHeight()/2, Mover.class) != null)
        {
            setLocation(abc.getX(),abc.getY()-image.getHeight());

            System.out.println("mg2_TouchContainer: " + vmg2_attached);
        }
    }
    
}
