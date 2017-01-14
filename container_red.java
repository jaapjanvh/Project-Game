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
    public boolean aboveLeftBoat = false;
    public boolean aboveRightBoat = false;
    /**
     * Act - do whatever the container wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public container_red()
    {
        GreenfootImage image = getImage();  
        image.scale(70, 70);
        setImage(image);
        
        setGravity(1);
        setMovementSpeed(5);
        
        setBlockingClasses(new Class[]{container_red.class});
        setBlockingClasses(new Class[]{container_green.class});
        setBlockingClasses(new Class[]{container_blue.class});
        //setBlockingClasses(new Class[]{boat.class});
    }

    public void act() 
    {
        if(Greenfoot.isKeyDown("space") == false){
            doGravity();  
        }
        GreenfootImage image = getImage();
        //canmove_container();
        //System.out.println(vmg2_left1);
        mg2_MoveCont1();
        
        //c_move();
        //mg2_TouchContainer();
        
        //als rechterkant van de container groter is dan de linkerkant van het schip en de rechterkant is kleiner dan het midden van het schip, staat het gewicht van de container op links
        //als linkerkant van de container kleiner is dan de rechterkant van het schip en de linkerkant is groter dan het midden van het schip, staat het gewicht van de container op rechts
        if(
            getX() + (getImage().getWidth() / 2) > getWorld().getObjects(boat.class).get(0).getX() - (getWorld().getObjects(boat.class).get(0).getImage().getWidth() / 2)
        &&  getX() + (getImage().getWidth() / 2) < getWorld().getObjects(boat.class).get(0).getX()) {
            aboveLeftBoat = true;}
        else if(
            getX() - (getImage().getWidth() / 2) < getWorld().getObjects(boat.class).get(0).getX() + (getWorld().getObjects(boat.class).get(0).getImage().getWidth() / 2)
        &&  getX() - (getImage().getWidth() / 2) > getWorld().getObjects(boat.class).get(0).getX()) {
            aboveRightBoat = true;}
        }        
    }

