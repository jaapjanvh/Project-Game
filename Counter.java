import greenfoot.*;
import java.awt.Color;

public class Counter extends Actor
{
    
    public int score = 0;
    
    public Counter() {
        this.updateImage();
    }
    
    public void incrementScore(int score) {
        this.score += score;
        
        this.updateImage();
    }
    
    private void updateImage() {
        setImage(new GreenfootImage("Score: " + score, 24, Color.WHITE, Color.BLUE));
    }
    
}
