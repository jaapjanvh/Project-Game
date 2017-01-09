import java.util.Random;

public class Array  
{
    
    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        
        return array[rnd];
    }
    
}
