import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class ProgressBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProgressBar extends Actor
{
    
    public int progress = 0;
    
    public ProgressBar() {
        this.updateImage();
    }
    
    public void incrementProgress(int p) {
        this.progress += p;
        
        this.updateImage();
    }
    
    private void updateImage() {
        GreenfootImage image = new GreenfootImage(104, 10);
        image.drawRect(0, 0, 99, 9);
        image.setColor(Color.BLUE);
        image.fillRect(2, 2, this.progress / 100, 6);
        setImage(image);
    }
    
}
