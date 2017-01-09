import greenfoot.*;
import java.util.List;
import java.awt.Color;

public abstract class Ship extends Actor
{
 
    private int movementSpeed = 1;
    private ProgressBar progressBar;
    private List<Ship> ships;
    
    abstract public int getUnloadingSpeed();
    
    abstract public int getScoreIncrement();
    
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
            PortWorld world = (PortWorld) getWorld();
            world.triggerGameOver();
       }
    }
    
    private void handleBorderCollision() {
        if (isTouching(MG1Wall.class)) {
            PortWorld world = (PortWorld) getWorld();
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
            this.progressBar.incrementProgress(this.getUnloadingSpeed());
            
            if (this.progressBar.progress == 9900) {
                List<MG1Counter> counters = getWorld().getObjects(MG1Counter.class);
                for (MG1Counter c: counters) {
                    c.incrementScore(this.getScoreIncrement());
                }
                
                getWorld().removeObject(this.progressBar);
                this.progressBar = null;
                getWorld().removeObject(this);
            }
        }
    }
    
}
