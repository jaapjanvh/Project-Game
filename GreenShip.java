import greenfoot.*;

public class GreenShip extends Ship
{
    
    public GreenShip() {
        this.setImage(new GreenfootImage("ship_green.png"));
        this.getImage().scale(48, 12);
        this.getImage().rotate(180); 
    }
    
    public void act() 
    {
        super.act();
    }    
    
    public int getUnloadingSpeed() {
        return 30;
    }    
    
    public int getScoreIncrement() {
        return 15;
    }
    
}
