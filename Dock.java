import greenfoot.*;

public class Dock extends Actor
{
    private static final int wave1Start = 0;
    private static final int wave2Start = 1000;
    private static final int wave3Start = 2500;
    private static final int wave4Start = 3000;
    private static final int wave5Start = 4000;
    
    private boolean isTimerStarted;
    private int timer = 0;
    
    public void act() 
    {   
        if (this.isTimerStarted) {
            switch (this.timer) {
                case wave1Start:        // 1st wave - boat 1/1
                    this.addGreenShip();
                    break;
                case wave2Start:        // 2nd wave - boat 1/4
                    this.addBlueShip();
                    break;
                case wave2Start + 250:  // 2nd wave - boat 2/4
                    this.addRedShip();
                    break;
                case wave2Start + 500:  // 2nd wave - boat 3/4
                    this.addGreenShip();
                    break;
                case wave2Start + 750:  // 2nd wave - boat 4/4
                    this.addBlueShip();
                    break;
                case wave3Start:        // 3rd wave - boat 1/2
                    this.addRedShip();
                    break;
                case wave3Start + 100:  // 3rd wave - boat 2/2
                    this.addGreenShip();
                    break;
                case wave4Start:        // 4th wave - boat 1/3
                    this.addBlueShip();
                    break;
                case wave4Start + 100:  // 4th wave - boat 2/3
                    this.addRedShip();
                    break;
                case wave4Start + 200:  // 4th wave - boat 3/3
                    this.addGreenShip();
                    break;
                case wave5Start:        // 5th wave - boat 1/4
                    this.addBlueShip();
                    break;
                case wave5Start + 100:  // 5th wave - boat 2/4
                    this.addRedShip();
                    break;
                case wave5Start + 200:  // 5th wave - boat 3/4
                    this.addGreenShip();
                    break;
                case wave5Start + 300:  // 5th wave - boat 4/4
                    this.addBlueShip();
                    break;
            }
            
            this.timer++;
        }
    }
    
    public void startTimer() {
        this.isTimerStarted = true;
    }
    
    public void stopTimer() {
        this.isTimerStarted = false;
    }
    
    /**
     * Adds a ship to the world grid
     */
    private void addShip() {
        //PortWorld world = (PortWorld) this.getWorld();
        
        //Ship ship = new Ship();
        //world.addObjectToGrid(ship, 0, 12);
        //ship.setLocation(ship.getX(), ship.getY() + 6);
    }
    
    /**
     * Adds a ship to the world grid
     */
    private void addGreenShip() {
        PortWorld world = (PortWorld) this.getWorld();
        
        Ship ship = new GreenShip();
        world.addObjectToGrid(ship, 0, 12);
        ship.setLocation(ship.getX(), ship.getY() + 6);
    }
    
    /**
     * Adds a ship to the world grid
     */
    private void addBlueShip() {
        PortWorld world = (PortWorld) this.getWorld();
        
        Ship ship = new BlueShip();
        world.addObjectToGrid(ship, 0, 12);
        ship.setLocation(ship.getX(), ship.getY() + 6);
    }
    
    /**
     * Adds a ship to the world grid
     */
    private void addRedShip() {
        PortWorld world = (PortWorld) this.getWorld();
        
        Ship ship = new RedShip();
        world.addObjectToGrid(ship, 0, 12);
        ship.setLocation(ship.getX(), ship.getY() + 6);
    }
    
}