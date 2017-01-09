import greenfoot.*;
import java.util.List;

public class GridWorld extends World
{
    
    public static final int gridWidth = 24;
    public static final int gridHeight = 24;
    private static Actor[][] grid = new Actor[gridWidth][gridHeight];
    
    private int counter = 0;
    
    public static final int gridSize = 24;

    public GridWorld()
    {    
        super(gridWidth * gridSize, gridHeight * gridSize, 1);
        
        setPaintOrder(ProgressBar.class, Ship.class, UnloadingPoint.class, Counter.class, Wall.class);
        
        addObjectToGrid(new Counter(), gridWidth / 2 - 1, 0);

        for (int x = 0; x < gridWidth; x++) {
            addObjectToGrid(new Wall(), x, 0);
            addObjectToGrid(new Wall(), x, gridHeight - 1);
        }
        
        for (int y = 0; y < gridHeight; y++) {
            addObjectToGrid(new Wall(), 0, y);
            addObjectToGrid(new Wall(), gridWidth - 1, y);
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
    }
    
    public void act() {
        if (this.counter == 0) {
            addObjectToGrid(new Ship(), 0, 12);
        } else if (this.counter == 1500) {
            addObjectToGrid(new Ship(), 0, 12);
        } else if (this.counter == 1750) {
            addObjectToGrid(new Ship(), 0, 12);
        } else if (this.counter == 2000) {
            addObjectToGrid(new Ship(), 0, 12);
        } else if (this.counter == 2750) {
            addObjectToGrid(new Ship(), 0, 12);
        } else if (this.counter == 2850) {
            addObjectToGrid(new Ship(), 0, 12);
        } else if (this.counter == 3500) {
            addObjectToGrid(new Ship(), 0, 12);
        } else if (this.counter == 3750) {
            addObjectToGrid(new Ship(), 0, 12);
        } else if (this.counter == 4000) {
            addObjectToGrid(new Ship(), 0, 12);
        } else if (this.counter == 4250) {
            addObjectToGrid(new Ship(), 0, 12);
        }
        
        this.counter++;
    }

    private void addObjectToGrid(Actor actor, int x, int y) {
        int xPos = x * gridSize + actor.getImage().getWidth() / 2;
        int yPos = y * gridSize + actor.getImage().getHeight() / 2;
        super.addObject(actor, xPos, yPos);

        int xRange = actor.getImage().getWidth() / gridSize;
        int yRange = actor.getImage().getHeight() / gridSize;

        for (int j = 0; j < yRange; j++) {
            for (int i = 0; i < xRange; i++) {
                grid[x][y] = actor;
            }
        }
        
        if (actor instanceof Ship) {
            actor.setLocation(actor.getX(), actor.getY() + 6);
        }
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
