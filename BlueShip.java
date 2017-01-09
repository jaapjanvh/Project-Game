import greenfoot.*;

public class BlueShip extends Ship
{
    
    public BlueShip() {
        this.setImage(new GreenfootImage("ship_blue.png"));
        this.getImage().scale(48, 12);
        this.getImage().rotate(180); 
    }
    
    public void act() 
    {
        super.act();
    }    
    
    public int getUnloadingSpeed() {
        return 50;
    }
    
    public int getScoreIncrement() {
        return 10;
    }
    
}
