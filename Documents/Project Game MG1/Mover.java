import greenfoot.*;
import java.util.List;

/**
 * The class Mover provides some basic movement methods. Use this as a superclass
 * for other actors that should be able to move left and right, jump up and fall 
 * down.
 * 
 * IMPORTANT: Do not use the {@code move(int speed)} method, replace it with 
 * {@code setMovementSpeed(speed)}, and then either {@code moveLeft()} or {@code moveRight}.
 * 
 * @author TriMil
 * @version 2.1.0
 */
public class Mover extends Actor
{
    private int acceleration = 0;                   // down (gravity)
    private int speed = 0;                          // running speed (sideways)
    private Class[] barrier = new Class[0];
    private int vSpeed = 0;                         // current vertical speed

    /**
     * Try to make the {@code Mover} move right, at a speed specified by {@link #setMovementSpeed(int)}
     * 
     * @see moveLeft()
     */
    public void moveRight()
    {
        if(canMoveRight())
            setLocation(getX() + speed, getY());
    }
    
    public void moveUp()
    {
        if(canMoveUp())
            setLocation(getX(), getY() + speed);
    }

    public void moveDown()
    {
        if(canMoveDown())
            setLocation(getX(), getY() - speed);
    }

    /**
     * Try to make the {@code Mover} move left, at a speed specified by {@link #setMovementSpeed(int)}
     * 
     * @see moveRight()
     */
    public void moveLeft()
    {
        if(canMoveLeft())
            setLocation (getX() - speed, getY());
    }

    /**
     * Detects if this {@code Mover} is just above a block that has been set as a barrier by {@link #setBlockingClasses(Class[])}
     */
    public boolean onGround()
    {
        boolean b = false;
        for(Class c: barrier)
        {
            Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2 + vSpeed, c);
            if(under != null)
                b = true;
        }
        if(b == true)
        {
            vSpeed = 0;
        }
        return b;
    }

    /**
     * Detects if this {@code Mover} can move both left and right
     * 
     * @see canMoveLeft()
     * @see canMoveRight()
     */
    public boolean canMoveSideways()
    {
        return canMoveLeft() && canMoveRight();
    }

    /**
     * Detects if this {@code Mover} can move left, not being blocked by any classes set as
     * barriers by {@link #setBlockingClasses(Class[])}
     * 
     * @see canMoveSideways()
     * @see canMoveRight()
     */
    public boolean canMoveLeft()
    {
        for(Class c: barrier)
        {
            List<Actor> bs = getIntersectingObjects(c);
            for(Actor b: bs)
            {
                if(b.getX() < this.getX())
                    return false;
            }
        }
        return true;
    }

    /**
     * Detects if this {@code Mover} can move right, not being blocked by any classes set as
     * barriers by {@link #setBlockingClasses(Class[])}
     * 
     * @see canMoveSideways()
     * @see canMoveLeft()
     */
    public boolean canMoveRight()
    {
        for(Class c: barrier)
        {
            List<Actor> bs = getIntersectingObjects(c);
            for(Actor b: bs)
            {
                if(b.getX() > this.getX())
                    return false;
            }
        }
        return true;
    }
    
    public boolean canMoveUp()
    {
        for(Class c: barrier)
        {
            List<Actor> bs = getIntersectingObjects(c);
            for(Actor b: bs)
            {
                if(b.getY() > this.getY())
                    return false;
            }
        }
        return true;
    }
    
    public boolean canMoveDown()
    {
        for(Class c: barrier)
        {
            List<Actor> bs = getIntersectingObjects(c);
            for(Actor b: bs)
            {
                if(b.getY() > this.getY())
                    return false;
            }
        }
        return true;
    }
    
    /**
     * Detects if this {@code Mover} can jump, not being blocked by any classes set as
     * barriers by {@link #setBlockingClasses(Class[])}
     * 
     * @see canMoveLeft()
     * @see canMoveRight()
     * @see jump(int)
     */
    public boolean canJump()
    {
        for(Class c: barrier)
        {
            List<Actor> bs = getIntersectingObjects(c);
            if(bs != null) {
                for(Actor b: bs)
                {
                    if(b.getY() > this.getY())
                        return false;
                }
            }
        }
        return true;
    }

    /**
     * Tries to jump, succedes if not blocked by classes set as barriers by {@link setBlockingClasses(Class[])}
     * 
     * @see canJump()
     */
    public void jump(int speed)
    {
        if(canJump())
            vSpeed = -speed;
    }

    /**
     * Makes the {@code Mover} fall if not supported by a class set as a barrier by {@link setBlockingClasses(Class[])}.
     * Falling will accelerate, depending on the set gravity, as the {@code Mover} falls farther. Should normally be called in the {@code act()} 
     * method every time.
     * 
     * @see setGravity(int)
     * @see jump(int)
     */
    public void doGravity()
    {
        if(vSpeed >= 0 && onGround())  return;
        if(vSpeed <= 0 && (!canJump()))  vSpeed = -1;
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        
    }

    /**
     * Returns a value indicating if the {@code Mover} is at the bottom of the world.
     */
    protected boolean atBottom()
    {
        return getY() >= getWorld().getHeight() - 2;
    }
    
    /**
     * Sets the speed at which this {@code Mover} moves.
     * 
     * @see moveLeft()
     * @see moveRight()
     */
    protected void setMovementSpeed(int newSpeed)
    {
        speed = newSpeed;
    }
    
    /**
     * Sets the classes this {@code Mover} can not intersect.
     * 
     * @see canMoveLeft()
     * @see canMoveRight()
     * @see canJump()
     * @see onGround()
     */
    protected void setBlockingClasses(Class[] c)
    {
        barrier = c;
    }
    
    /**
     * Sets the gravity for this {@code Mover}
     * 
     * @see doGravity()
     * @see jump()
     */
    protected void setGravity(int g)
    {
        acceleration = g;
    } 
    
    /**
     * Deprecated. Originally ment at end of act method, no replacement needed
     * 
     * @deprecated 2.1.0
     */
    @Deprecated
    protected void setVSpeed(int v)
    {
        vSpeed = v;
    }
}
