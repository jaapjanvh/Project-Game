import greenfoot.*;
import java.util.List;

public class PortWorld extends World
{
    
    private static final int gridWidth = 24;
    private static final int gridHeight = 24;
    private static Actor[][] grid = new Actor[gridWidth][gridHeight];
    
    private Dock dock = new Dock();
    
    public static final int gridSize = 24;

    public PortWorld()
    {    
        super(gridWidth * gridSize, gridHeight * gridSize, 1);
        
        setPaintOrder(ProgressBar.class, Ship.class, UnloadingPoint.class, MG1Counter.class, MG1Wall.class);
        
        addObjectToGrid(new MG1Counter(), gridWidth / 2 - 1, 0);

        for (int x = 0; x < gridWidth; x++) {
            addObjectToGrid(new MG1Wall(), x, 0);
            addObjectToGrid(new MG1Wall(), x, gridHeight - 1);
        }
        
        for (int y = 0; y < gridHeight; y++) {
            addObjectToGrid(new MG1Wall(), 0, y);
            addObjectToGrid(new MG1Wall(), gridWidth - 1, y);
        }
        
        removeObjectAt(0, 11);
        removeObjectAt(0, 12);
        removeObjectAt(0, 13);
        
        addObjectToGrid(new Arrow(), 4, 4);
        addObjectToGrid(new Arrow(), 12, 4);
        addObjectToGrid(new Arrow(), 20, 4);
        
        addObjectToGrid(new Arrow(), 4, 12);
        addObjectToGrid(new Arrow(), 12, 12);
        addObjectToGrid(new Arrow(), 20, 12);
        
        addObjectToGrid(new Arrow(), 4, 20);
        addObjectToGrid(new Arrow(), 12, 20);
        addObjectToGrid(new Arrow(), 20, 20);
        
        removeObjectAt(gridWidth - 1, 4);
        removeObjectAt(gridWidth - 1, 12);
        removeObjectAt(gridWidth - 1, 20);
        
        addObjectToGrid(new UnloadingPoint(), gridWidth - 1, 4);
        addObjectToGrid(new UnloadingPoint(), gridWidth - 1, 12);
        addObjectToGrid(new UnloadingPoint(), gridWidth - 1, 20);
        
        super.addObject(this.dock, 0, 0);
        this.dock.startTimer();
    }

    public void addObjectToGrid(Actor actor, int x, int y) {
        int xPos = x * gridSize + actor.getImage().getWidth() / 2;
        int yPos = y * gridSize + actor.getImage().getHeight() / 2;
        super.addObject(actor, xPos, yPos);

        grid[x][y] = actor;
    }
    
    private void removeObjectAt(int x, int y) {
        Actor actor = grid[x][y];
        removeObject(actor);
        grid[x][y] = null;
    }
    
    public void triggerGameOver() {
        this.addObject(new GameOver(), this.getWidth() / 2, this.getHeight() / 2);
        Greenfoot.playSound("Titanic.mp3");
        Greenfoot.stop();
    }
    
}
