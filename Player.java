import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor {
    World world = getWorld();
    private static int health = 3;
    int speed = 3;
    private GreenfootImage arriba = new GreenfootImage("atras.png");
    private GreenfootImage abajo = new GreenfootImage("adelante.png");
    // imagenes para la animación de la derecha.
    private GreenfootImage derecha = new GreenfootImage("der.png");
    private GreenfootImage der2 = new GreenfootImage("der2.png");
    private GreenfootImage der3 = new GreenfootImage("der3.png");
    private GreenfootImage der4 = new GreenfootImage("der4.png");
    // imagenes para la animación de la izquierda.
    private GreenfootImage izquierda = new GreenfootImage("izq.png");
    public int boosterUsados;
    private int frame = 0;
    private int animationCounter = 0;
    
    public Player() {
        boosterUsados = 0;
    }
    
    public static int getHealth() {
        return health;
    }
    
    public static void setHealth(int h) {
        health = h;
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        movePlayer();
        usarBooster();
        animationCounter++;
    }
    
    public void movePlayer() {
        if(Greenfoot.isKeyDown("up")){
            setImage(arriba);
            setLocation(getX(), getY() - speed);
        }
        if(Greenfoot.isKeyDown("down")){
            setImage(abajo);
            setLocation(getX(), getY() + speed);
        }
        if(Greenfoot.isKeyDown("left")){
            setImage(izquierda);
            setLocation(getX() - speed, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setImage(derecha);
            setLocation(getX() + speed, getY());
        }
    }   
    
    public void usarBooster() {
        if(isTouching(Booster.class)){
            removeTouching(Booster.class);
            Greenfoot.playSound("minecraft_eat.mp3");
            boosterUsados = boosterUsados + 1;
            setHealth(getHealth() - 1);
        }
    }
    
}
