import greenfoot.*;

public class RedShip extends Ship
{
    
    public RedShip() {
        this.setImage(new GreenfootImage("ship_red.png"));
        this.getImage().scale(48, 12);
        this.getImage().rotate(180); 
    }
    
    public void act() 
    {
        super.act();
    }    
    
    public int getUnloadingSpeed() {
        return 75;
    }    
    
    public int getScoreIncrement() {
        return 5;
    }
    
}
