import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiniGame2 extends World
{
    public hook hook;
    public int vmg2_redcontainer;
    public int vmg2_bluecontainer;
    public int vmg2_greencontainer;    
    public int vmg2_truck;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MiniGame2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 750, 1); 
        prepare();
        
    }
    public void act()
    {
        count_containers();
        count_trucks();
        if(Greenfoot.isKeyDown("escape")) {
            Greenfoot.setWorld(new Menu());
        }
    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        hook = new hook();
        counter();       
        addObject(hook,90,60);
        rope_small rope_small = new rope_small();
        addObject(rope_small,90,0);
        crane crane = new crane();
        addObject(crane,271,25);
        add_vehicle add_vehicle = new add_vehicle();
        addObject(add_vehicle,25,725);        
        boat boat = new boat();
        addObject(boat,220,650);
        water water = new water();
        addObject(water,600,700);
        road road = new road();
        addObject(road,485,700);
        road road2 = new road();
        addObject(road2,585,700);
        road road5 = new road();
        addObject(road5,630,700);        
    }
    
    public void counter()
    {
        // Adding containers to world
        container_blue container_blue = new container_blue();        
        addObject(container_blue, 35, 550);
        container_red container_red2 = new container_red();
        addObject(container_red2,35,485); 
        container_green container_green4 = new container_green();
        addObject(container_green4,35,420);        
        
        container_green container_green3 = new container_green();
        addObject(container_green3,97,550);
        container_blue container_blue2 = new container_blue();        
        addObject(container_blue2,97,485);
        
        container_blue container_blue4 = new container_blue();
        addObject(container_blue4,159,485);        
        container_blue container_blue3 = new container_blue();
        addObject(container_blue3,159,550);
        
        container_red container_red = new container_red();
        addObject(container_red,221,550);
        container_red container_red3 = new container_red();
        addObject(container_red3,221,485);
        container_green container_green5 = new container_green();
        addObject(container_green5,221,420);        
        
        container_green container_green = new container_green();
        addObject(container_green,283,550);
        container_green container_green7 = new container_green();
        addObject(container_green7,283,485);

        container_green container_green6 = new container_green();
        addObject(container_green6,345,485);
        container_red container_red4 = new container_red();
        addObject(container_red4,345,550);
        
        container_green container_green2 = new container_green();
        addObject(container_green2,407,550);
        container_blue container_blue5 = new container_blue();
        addObject(container_blue5,407,485);
        container_red container_red5 = new container_red();
        addObject(container_red5,407,420);


        // added all the containers
    }
    public void count_containers()
    {
      vmg2_redcontainer = getObjects(container_red.class).size();
      vmg2_bluecontainer = getObjects(container_blue.class).size();
      vmg2_greencontainer = getObjects(container_green.class).size();
    }
    public void count_trucks()
    {
        vmg2_truck = getObjects(vehicle.class).size();
    }
}
