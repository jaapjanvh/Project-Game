import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rope here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rope_small extends Actor
{
    /**
     * Act - do whatever the rope wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkInput();
        maxmove();

    }

    //&& getOneIntersectingObject(container1.class) == null

    public rope_small()
    {
        GreenfootImage image = getImage();  
        image.scale(2, 2);
        setImage(image); 
    }

    private void checkInput()
    {
        if (hook.vmg2_right == true || Greenfoot.isKeyDown("space"))
        {
            if(Greenfoot.isKeyDown("right")  )
            {
                move(hook.vmg2_speed);
                //if (getOneIntersectingObject(container1.class) != null) 
                //{move(-hook.vmg2_speed);}
            }
        }
        if (hook.vmg2_left == true || Greenfoot.isKeyDown("space"))
        {
            if(Greenfoot.isKeyDown("left"))
            {
                move(-hook.vmg2_speed);
                //if (getOneIntersectingObject(container1.class) != null) 
                //{move(hook.vmg2_speed);

            }
        }
        GreenfootImage image = getImage();
        if (hook.vmg2_down == true || Greenfoot.isKeyDown("space"))
        {
            if (Greenfoot.isKeyDown("down")) 
            { 
                MyWorld world = (MyWorld)getWorld();
                image.scale(2, world.hook.getY() );
                setLocation(getX(),world.hook.getY()/2+world.hook.vmg2_speed);

            }
        }
        if (hook.vmg2_up == true || Greenfoot.isKeyDown("space"))
        {
            if (Greenfoot.isKeyDown("up")) 
            { 
                MyWorld world = (MyWorld)getWorld();
                image.scale(2, world.hook.getY() );
                setLocation(getX(),world.hook.getY()/2+world.hook.vmg2_speed);
            }
        }

    }
    private void maxmove()
    {
        if (getX()>520) 
        setLocation(520, getY());
        if (getY()<40) 
        setLocation(getX(),40);
    }
}
