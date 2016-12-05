import greenfoot.*;

public class Arrow extends Actor
{
    
    public Arrow() {
        this.getImage().scale(24, 24);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            this.setRotation(this.getRotation() + 90);
        }
    }
    
}
