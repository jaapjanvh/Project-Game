import greenfoot.*;


public class DemoWorld extends World
{
    /**
     * Make a new world with grass and a ship.
     * 
     */
    public DemoWorld()
    {    
        // Create a new world, somewhere in Australia
        super(700, 500, 1); 
        
        // Make grass
        addObject(new Grass(), 200, 100);
        addObject(new Grass(), 200, 150);
        addObject(new Grass(), 200, 350);
        addObject(new Grass(), 400, 350);
        addObject(new Grass(), 400, 400);
        addObject(new Grass(), 200, 400);
        
        addObject(new Ship(), 0, 200);
    }
}
