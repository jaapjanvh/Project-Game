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
        prepare();
        
        setPaintOrder(Ship.class);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Port port = new Port();
        addObject(port,678,243);
        Port port2 = new Port();
        addObject(port2,612,246);
        port2.setLocation(670,400);
        port.setLocation(670,243);
        Border border = new Border();
        addObject(border,665,326);
        Border border2 = new Border();
        addObject(border2,672,170);
        border2.setLocation(656,158);
        border.setLocation(654,324);
        port2.setLocation(668,405);
        Port port3 = new Port();
        addObject(port3,37,412);
        Port port4 = new Port();
        addObject(port4,38,250);
        Border border3 = new Border();
        addObject(border3,662,459);
        Border border4 = new Border();
        addObject(border4,580,463);
        Border border5 = new Border();
        addObject(border5,499,460);
        Border border6 = new Border();
        addObject(border6,420,458);
        Border border7 = new Border();
        addObject(border7,337,458);
        Border border8 = new Border();
        addObject(border8,255,458);
        Border border9 = new Border();
        addObject(border9,171,461);
        Border border10 = new Border();
        addObject(border10,87,461);
        border10.setLocation(49,452);
        border10.setLocation(44,453);
        port3.setLocation(31,372);
        border9.setLocation(134,453);
        border8.setLocation(223,453);
        border7.setLocation(313,452);
        border6.setLocation(402,454);
        border5.setLocation(491,453);
        border7.setLocation(313,453);
        border4.setLocation(580,453);
        border3.setLocation(662,453);
        port2.setLocation(668,385);
        border.setLocation(657,253);
        port2.setLocation(668,370);
        border.setLocation(658,288);
        border2.setLocation(655,135);
        port.setLocation(667,205);
        border2.setLocation(655,124);
        port3.setLocation(31,371);
        Border border11 = new Border();
        addObject(border11,52,301);
        border11.setLocation(43,290);
        port4.setLocation(31,208);
        Border border12 = new Border();
        addObject(border12,52,132);
        border12.setLocation(45,127);
        border12.setLocation(45,127);
        border6.setLocation(402,453);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(31,208);
        port4.setLocation(667,41);
        Port port5 = new Port();
        addObject(port5,39,54);
        port5.setLocation(33,46);
    }
}
