import greenfoot.*;
import java.awt.Color;

public class MessageBox extends Actor
{
    
    public MessageBox(String message) {
        GreenfootImage image = new GreenfootImage(message, 24, Color.BLACK, Color.WHITE);
        
        setImage(image);
    }  
    
}
