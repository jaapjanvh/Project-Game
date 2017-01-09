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
    /**
     * Act - do whatever the container wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public container_green()
    {
        GreenfootImage image = getImage();  
        image.scale(70, 70);
        setImage(image);
        
        setGravity(2);
        setMovementSpeed(5);
        setBlockingClasses(new Class[]{container_green.class});
        
    }
    public void act() 
    {
        // Add your action code here.
        doGravity();
        mg2_MoveCont();
    }
    public void test()
    {
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
            
         }
    }

}
