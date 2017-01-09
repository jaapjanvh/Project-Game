import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class hook extends Actor
{
    public static boolean vmg2_down = true;
    public static boolean vmg2_up = true;
    public static boolean vmg2_right= true;
    public static boolean vmg2_left= true;
    public static int vmg2_speed = 3 ;
    public boolean vmg2_hooked;    
    /**
     * Act - do whatever the hook wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public hook()
    {
        GreenfootImage image = getImage();  
        image.scale(22, 60);
        setImage(image);    
    } 

    public void act() {   
        MyWorld world = (MyWorld)getWorld();
        //canmove();
        checkInput();
        maxmove();
        mg2_hooked();
        //System.out.println("Red: " + world.vmg2_redcontainer + " ||Blue: " + world.vmg2_bluecontainer + " ||Green: " + world.vmg2_greencontainer);
        //GreenfootImage image = getImage();
        //System.out.println(getOneObjectAtOffset(0, image.getHeight()/2, Mover.class));
    }

    private void checkInput()
    {   
        GreenfootImage image = getImage(); 
        if (vmg2_right == true || Greenfoot.isKeyDown("space"))
        {
            if(Greenfoot.isKeyDown("right")  )
            {
                move(vmg2_speed);
            }
        }
        if (vmg2_left == true || Greenfoot.isKeyDown("space"))
        {
            if(Greenfoot.isKeyDown("left"))
            {
                move(-vmg2_speed);
            }
        }
        if (vmg2_up == true || Greenfoot.isKeyDown("space"))
        {
            if(Greenfoot.isKeyDown("up"))
            {
                setLocation(getX(), getY()-vmg2_speed*2);
            }
        }
        if ((vmg2_down == true || Greenfoot.isKeyDown("space")))
        {
            if(Greenfoot.isKeyDown("down"))
            {
                setLocation(getX(), getY()+vmg2_speed*3);
            }
        }
    }

    private void canmove()
    {
        GreenfootImage image = getImage(); 
        if (getOneObjectAtOffset(0, image.getHeight()/2, null) == null) 
        {
            vmg2_down= true;
        }
        else  
        {
            vmg2_down = false;
        }
        if (getOneObjectAtOffset(0, -image.getHeight()/2, null) == null) 
        {
            vmg2_up= true;
        }
        else  
        {
            vmg2_up = false;
        }
        if (getOneObjectAtOffset(-image.getWidth()/2,0, null) == null) 
        {
            vmg2_left= true;
        }
        else  
        {
            vmg2_left = false;
        }
        if (getOneObjectAtOffset(+image.getWidth()/2,0, null) == null) 
        {
            vmg2_right= true;
        }
        else  
        {
            vmg2_right = false;
        }
    }

    private void maxmove()
    {
        if (getX()>520) 
            setLocation(520, getY());
        if (getY()<40) 
            setLocation(getX(),40);
    }

    public void mg2_hooked()
    {
        if (getOneIntersectingObject(Mover.class) != null)
        {
            vmg2_hooked = true;
        }
        else
        {
            vmg2_hooked = false;
        }
    }
}