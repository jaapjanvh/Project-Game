import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class containersub here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class container_green extends Mover
{
    public static String vmg2_Green = "green";
    public boolean aboveLeftBoat = false;
    public boolean aboveRightBoat = false;
    /**
     * Act - do whatever the container wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public container_green()
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
        mg2_MoveCont();
        //canmove_container();
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
    public void test()
    {
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
            
         }
    }

}
