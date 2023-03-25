import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {
    private static Player player = new Player();
    private static Health healthBar = new Health();
    private int potionSpawnTimer = 1;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    // level 1.
    public MyWorld() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public static Player getPlayer() {
        return player;
    }
    
    public static Health getHealth() {
        return healthBar;
    }
        
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        addObject(player,350,100);
        player.setLocation(347,99);
        player.setLocation(321,235);
        player.setLocation(305,177);
        addObject(healthBar,550, 30);
    }
        
    public void spawnPotion() {
        if(Greenfoot.getRandomNumber(100)>=90){
            addObject(new Booster(), Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(300));
        }
    }
    
    private void potionSpawnTimer() {
        potionSpawnTimer = (potionSpawnTimer + 1)%21;
        if (potionSpawnTimer == 0) {
            spawnPotion();
        }
    }
    
    public void act() {
        potionSpawnTimer();
        if(Player.getBoosterUsados() == 2){
            Level level = new Level();
            Greenfoot.setWorld(level);
        }
    }
    
}
