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
        setGravity(1);
        setMovementSpeed(5);    
        setBlockingClasses(new Class[]{container_red.class});
        setBlockingClasses(new Class[]{container_green.class});
        setBlockingClasses(new Class[]{container_blue.class});
    }

    public void act() 
    {
        if(Greenfoot.isKeyDown("space") == false){
            doGravity();  
        }
        mg2_MoveCont();
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
