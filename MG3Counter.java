import greenfoot.*;
import java.awt.Color;

public class MG3Counter extends Actor
{
    
    public int move;
    
    public MG3Counter(int maxMoves) {
        move=maxMoves;
        updateImage();
    }
    
    public void decreaseScore() {
        move -= 1;
        if (move<=0)
                {
                    getWorld().addObject(new TryAgain(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                }
        updateImage();
    }
    
    private void updateImage() {
        setImage(new GreenfootImage("Moves: " + move, 20, Color.WHITE, Color.BLUE));
    }
    
}