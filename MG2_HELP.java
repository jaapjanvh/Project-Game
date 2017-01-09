import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MG2_HELP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MG2_HELP extends Actor
{
    /**
     * Act - do whatever the MG2_HELP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //help();
        click();
    }
    
    public void help()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop(); 
        }
    }
    private void click(){
        MyWorld world = (MyWorld)getWorld();
        if (Greenfoot.mousePressed(this)) {
            world.addObject(new InfoPanel(),640,375);
            Greenfoot.delay(1000);
        }
    }
    
    
    protected class InfoPanel extends Actor{
        public InfoPanel(){
            //World world = getWorld();
            setImage("instructions.png");
            //world.addObject(new InfoPanel(), 0, 0);
        }
        
        public void act(){
            if(Greenfoot.mousePressed(this)){
                getWorld().removeObject(this);
                Greenfoot.start();
            }
        }
    
    }
}
