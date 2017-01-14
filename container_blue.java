import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class containersub here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class container_blue extends Mover
{
    MiniGame2 world = (MiniGame2)getWorld();
    public static String vmg2_Blue = "blue";
    public boolean aboveLeftBoat = false;
    public boolean aboveRightBoat = false;

    /**
     * Act - do whatever the container wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public container_blue()
    {
        GreenfootImage image = getImage();  
            image.scale(70, 70);
            setImage(image);
            
        setBlockingClasses(new Class[]{container_red.class});
        setBlockingClasses(new Class[]{container_green.class});
        setBlockingClasses(new Class[]{container_blue.class});
    }

    public void act() 
    {
        // Add your action code here.
        //c_move();
        mg2_MoveCont();
        //System.out.println(world.hook.vmg2_hooked);
        //mg2_setImage();
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

    public void mg2_setImage()
    {
        if (world.hook.vmg2_hooked == true)
        {
            GreenfootImage image = getImage();  
            image.scale(70, 70);
            setImage(image);
        }
        else
        {
            GreenfootImage image = getImage();  
            image.scale(70, 70);
            setImage(image);
        }
    }
}
