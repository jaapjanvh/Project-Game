import greenfoot.*;
import java.util.List;

public class Ship extends Actor
{
    
    private int movementSpeed = 1;
    private ProgressBar progressBar;
    private List<Ship> ships;
    
    public Ship () {
        this.setImage(new GreenfootImage("http://oi66.tinypic.com/2gufxo5.jpg"));
        this.getImage().scale(48, 12);
        this.getImage().rotate(180); 
    }
    
    public void act() 
    {
        move(movementSpeed);
        
        this.handleArrowCollision();
        this.handleShipCollision();
        this.handleBorderCollision();
        this.handleUnloadingPointCollision();
    }
    
    private void handleArrowCollision() {
        List<Arrow> arrows = this.getIntersectingObjects(Arrow.class);
        
        for (Arrow a : arrows) {
            if (Math.abs(a.getX() - this.getX()) == 0 && Math.abs(a.getY() - this.getY()) == 0) {
                this.setRotation(a.getRotation());
            }
        }
    }
    
    private void handleShipCollision() {
       Ship ship = (Ship) this.getOneIntersectingObject(Ship.class);
       
       if (null != ship) {
            GridWorld world = (GridWorld) getWorld();
            world.triggerGameOver();
       }
    }
    
    private void handleBorderCollision() {
        if (isTouching(Wall.class)) {
            GridWorld world = (GridWorld) getWorld();
            world.triggerGameOver();
        }
    }
    
    private void handleUnloadingPointCollision() {
        boolean stop = false;
        List<UnloadingPoint> unloadingPoints = this.getIntersectingObjects(UnloadingPoint.class);
        
        for (UnloadingPoint p : unloadingPoints) {
            if (Math.abs(p.getX() - this.getX()) == 0 && Math.abs(p.getY() - this.getY()) == 0) {
               stop = true;
            }
        }
        
        if (stop == true && null == this.progressBar) {
            movementSpeed = 0;
            this.progressBar = new ProgressBar();
            getWorld().addObject(this.progressBar, this.getX() - 45, this.getY() - 15);
            
        }
        
        if (this.progressBar != null) {
            this.progressBar.incrementProgress(50);
            
            if (this.progressBar.progress == 9900) {
                List<Counter> counters = getWorld().getObjects(Counter.class);
                for (Counter c: counters) {
                    c.incrementScore(10);
                }
                
                getWorld().removeObject(this.progressBar);
                this.progressBar = null;
                getWorld().removeObject(this);
            }
        }
    }
    
}
