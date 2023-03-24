import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor
{
    GreenfootImage heart1 = new GreenfootImage("heart1.png");
    GreenfootImage heart2 = new GreenfootImage("heart2.png");
    GreenfootImage heart3 = new GreenfootImage("heart3.png");
        
    /**
     * Act - do whatever the Health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        update();
    }
    
    public void update() {
        if (Player.getHealth() == 3) {
            setImage(heart1);
        } 
        else if (Player.getHealth() == 2){
            setImage(heart2);    
        }
        else if (Player.getHealth() == 1){
            setImage(heart3);
        }
        else if (Player.getHealth() == 0) {
            World world = getWorld();
            world.removeObjects(world.getObjects(null));
            GameOver gameOver = new GameOver();
            world.addObject(gameOver, world.getWidth()/2, world.getHeight()/2);
            Greenfoot.stop();
        }
    }
    
}
