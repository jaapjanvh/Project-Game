import greenfoot.*;


public class Ship extends Mover
{
    /**
     * Creates a new ship
     */
    public Ship()
    {
        setMovementSpeed(2);
        setGravity(0);
        // Set the objects this ship can not go through.
        setBlockingClasses(  new Class[]{Grass.class}  );
        GreenfootImage ship = new GreenfootImage("http://i65.tinypic.com/rvhg6v.png");
        ship.scale(ship.getWidth() - 150, ship.getHeight() - 150);
        setImage(ship); 

    }
    
    /**
     * Check for key presses that signal movements
     */
    public void act() 
    {
        int offsetX=0;
        int offsetY=0;
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(0);
            move(-1);
            offsetX=-50;
        }
              
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(180);
            move(-1);
            offsetX=50;
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(270);
            move(-1);
            offsetY=50;
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(90);
            move(-1);
            offsetY=-50;
        }
        detectCollision(offsetX,offsetY);
    }    
    
    public void detectCollision(int x,int y)
    {
        Actor border;
        border=getOneObjectAtOffset(x,y,Border.class);
        if (border!=null)
        {
            World myWorld = getWorld();
            GameOver gameover = new GameOver();
            myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
            Greenfoot.playSound("GameOver.wav");
            Greenfoot.stop();
        }
        
        Actor port;
        port=getOneObjectAtOffset(0,0,Port.class);
        if (port!=null)
        {
            //boot stopt met varen voor X seconden en verandert in een leeg bootje
            GreenfootImage ship = new GreenfootImage("wombat.png");
            //ship.scale(ship.getWidth() - 150, ship.getHeight() - 150);
            setImage(ship); 
        }
    }
}
