import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 750, 1); 
        prepare();
        
    }
    public void act()
    {
        count_containers();
        count_trucks();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        hook = new hook();
        counter();
        //        hook.setLocation(731,76);        
        addObject(hook,90,60);
        rope_small rope_small = new rope_small();
        addObject(rope_small,90,0);
        //rope_small rope_small2 = new rope_small();
        //addObject(rope_small2,82,0);
        crane crane = new crane();
        addObject(crane,271,25);
        boat boat = new boat();
        addObject(boat,220,650);
        //vehicle vehicle = new vehicle();
        //addObject(vehicle,575,610);
        water water = new water();
        addObject(water,600,700);
        road road = new road();
        addObject(road,500,700);
        road road2 = new road();
        addObject(road2,600,700);
        road road3 = new road();
        addObject(road3,700,700);

        //vehicle vehicle = new vehicle();
        //addObject(vehicle,-1000,-10000);   

        //System.out.println(v_test);
        add_vehicle add_vehicle = new add_vehicle();
        addObject(add_vehicle,25,725);

        MG2_HELP mg2_help = new MG2_HELP();
        addObject(mg2_help,1265,25);
    }
    
    public void counter()
    {
             // Adding containers to world
        addObject(new container_blue(), 35, 550);
        container_blue container_blue2 = new container_blue();
        addObject(container_blue2,105,550);        
        container_blue container_blue3 = new container_blue();
        addObject(container_blue3,180,550);
        //container_red container_red = new container_red();
        //addObject(container_red,255,550);
        container_green container_green = new container_green();
        addObject(container_green,330,550);
        container_green container_green2 = new container_green();
        addObject(container_green2,405,550);
        container_red container_red2 = new container_red();
        addObject(container_red2,255,465);        
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
