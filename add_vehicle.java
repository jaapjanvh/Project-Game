import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class add_vehicle extends Actor
{
    MyWorld world = (MyWorld)getWorld();
    /**
     * Act - do whatever the add_vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        addnewvehice();
    }
        /**
     * Adds a vehicle to the world. 
     * Starts with 2. Then after a vehicle is removed, vmg2_test is set to 1 and it triggers this funtion to add a new vehicle.
     */
    public void addnewvehice()
    {
        MyWorld world = (MyWorld)getWorld();
        if (world.vmg2_bluecontainer > 0 || world.vmg2_redcontainer > 0 || world.vmg2_greencontainer > 0)
         {
                 if (world.vmg2_truck == 0)
                 {
                 vehicle vehicle = new vehicle();
                 getWorld().addObject(vehicle,575,610);
                }
        }
        else
        {
            World myWorld = getWorld();
            GameOver gameover = new GameOver();
            myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
            Greenfoot.stop();           
        }
    }
}
