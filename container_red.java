import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class containersub here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class container_red extends Mover
{
    public static String vmg2_Red = "red";
    public boolean vmg2_down2;
    public boolean vmg2_up2;
    public boolean vmg2_right2;
    public boolean vmg2_left2; 
    /**
     * Act - do whatever the container wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public container_red()
    {
        GreenfootImage image = getImage();  
        image.scale(70, 70);
        setImage(image);

        setGravity(2);
        setMovementSpeed(5);
        setBlockingClasses(new Class[]{container_red.class});

    }

    public void act() 
    {
        GreenfootImage image = getImage();
        doGravity();
        canmove_container();
        System.out.println(vmg2_left1);
        mg2_MoveCont1();
        mg2_TouchContainer();
    }
}

