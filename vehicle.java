import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Vehicle class.
 * Spawns in a random vehicle as long as there are containers in the world.
 * 
 * @BramBrouwer
 * 
 */
public class vehicle extends add_vehicle
{
    public int vRandom = Greenfoot.getRandomNumber(3);
    public int vRandom1 = Greenfoot.getRandomNumber(2);    
    private String vColor = "blank";
    //public static int world.vmg2_bluecontainer = 3;
    //public static int world.vmg2_redcontainer = 2;
    //public static int world.vmg2_greencontainer = 2;
    GreenfootImage image = getImage();
     /**
     * Act - do whatever the vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
     {
         load_vehicle();
      }
     /**
     * If a container is placed (collision) on a vehicle both will dissapear from the world.
     * It will add a new vehicle and this function set a random colored vehicle
     */
     public void load_vehicle() 
     {
        Actor red = getOneIntersectingObject(container_red.class);
        Actor green = getOneIntersectingObject(container_green.class);
        Actor blue = getOneIntersectingObject(container_blue.class);
        MyWorld world = (MyWorld)getWorld();
        /**
         * If there is still a container in every color, set random colored truck
         * 
         */
        if (world.vmg2_bluecontainer > 0 && world.vmg2_redcontainer > 0 && world.vmg2_greencontainer > 0)
        {
            if (vRandom == 0) 
              {  
               setImage("Truck_red2.png"); 
               vColor = "red";
               if (vColor == container_red.vmg2_Red && red != null)
               {
                 touchcontainer();
               }
            }
            if (vRandom == 1) 
              {
               setImage("Truck_blue2.png");
               vColor = "blue";
               if (vColor == container_blue.vmg2_Blue && blue != null)
               {
                 touchcontainer();
               }
              
            }
            if (vRandom == 2) 
              {     
               setImage("Truck_green2.png");
               vColor = "green";
               if (vColor == container_green.vmg2_Green && green != null)
               {
                 touchcontainer();
               }
              
            }

        }
        else if (world.vmg2_bluecontainer > 0 && world.vmg2_redcontainer > 0 && world.vmg2_greencontainer == 0)
        {
             if (vRandom1 == 0) 
              {  
               setImage("Truck_red2.png"); 
               vColor = "red";
               if (vColor == container_red.vmg2_Red && red != null)
               {
                 touchcontainer();
               }
              
            }
            if (vRandom1 == 1) 
              {
               setImage("Truck_blue2.png");
               vColor = "blue";
               if (vColor == container_blue.vmg2_Blue && blue != null)
               {
                 touchcontainer();
               }
              
            }
        }
        else if (world.vmg2_bluecontainer == 0 && world.vmg2_redcontainer > 0 && world.vmg2_greencontainer > 0)
        {
            if (vRandom1 == 0) 
              {  
               setImage("Truck_red2.png"); 
               vColor = "red";
               if (vColor == container_red.vmg2_Red && red != null)
               {
                 touchcontainer();
               }
              
            }
            if (vRandom1 == 1) 
              {
               setImage("Truck_green2.png");
               vColor = "green";
               if (vColor == container_green.vmg2_Green && green != null)
               {
                 touchcontainer();
               }
              
            }
        }
        else if (world.vmg2_bluecontainer > 0 && world.vmg2_redcontainer == 0 && world.vmg2_greencontainer > 0)
        {
            if (vRandom1 == 0) 
              {  
               setImage("Truck_green2.png"); 
               vColor = "green";
               if (vColor == container_green.vmg2_Green && green != null)
               {
                 touchcontainer();
               }
              
            }
            if (vRandom1 == 1) 
              {
               setImage("Truck_blue2.png");
               vColor = "blue";
                    if (vColor == container_blue.vmg2_Blue && blue != null)
                    {
                     touchcontainer();
                    } 
            }
        }
        else if (world.vmg2_bluecontainer > 0 && world.vmg2_redcontainer == 0 && world.vmg2_greencontainer == 0)
        {
               setImage("Truck_blue2.png");
               vColor = "blue";
                    if (vColor == container_blue.vmg2_Blue && blue != null)
                    {
                     touchcontainer();
                    }   
        }
        else if (world.vmg2_bluecontainer == 0 && world.vmg2_redcontainer > 0 && world.vmg2_greencontainer == 0)
        {
               setImage("Truck_red2.png");
               vColor = "red";
                    if (vColor == container_red.vmg2_Red && red != null)
                    {
                     touchcontainer();
                    }   
        }
        else if (world.vmg2_bluecontainer == 0 && world.vmg2_redcontainer == 0 && world.vmg2_greencontainer > 0)
        {
               setImage("Truck_green2.png");
               vColor = "green";
                    if (vColor == container_green.vmg2_Green && green != null)
                    {
                     touchcontainer();
                    }   
                }
      }
      
     /**
     * If a container touches the vehicle (this actor) it deletes the container from the world.
     */
     public void touchcontainer()
     {
       Actor b = getOneIntersectingObject(Mover.class);
         if(b != null)  
         {  
          getWorld().removeObject(b);
          getWorld().removeObject(this);
       }
     }
    
}
