import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{
    GreenfootImage levelBG = new GreenfootImage("level1BG.png");
    GreenfootImage levelC = new GreenfootImage("levelC.png");
    GreenfootImage levelDECO = new GreenfootImage("levelDECO.png");
    Player player = MyWorld.getPlayer();
    Health health = MyWorld.getHealth();
    /**
     * Constructor for objects of class Level.
     * 
     */
    public Level() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setBackground(levelBG);
        addObject(player,350,100);
    }