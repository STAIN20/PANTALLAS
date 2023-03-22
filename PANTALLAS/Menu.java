import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Flecha flecha = new Flecha();
    private int opcion = 0; // 0 = jugar, 1 = Salir
    
    public Menu()
    {    
        super(600, 400, 1); 
        prepararMundo();
    }
    
    private void prepararMundo(){
        addObject(new Jugar(),300,250);
        addObject(new Salir(),300,320);//Ubicación de las selecciones
        addObject(flecha,220,250);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("UP") && opcion!=0) {opcion++;}
        if (Greenfoot.isKeyDown("DOWN") && opcion!=1) {opcion--;} //asignación de telcas
        
        if(opcion>=2) opcion=0;
        if (opcion<0) opcion=1;
        
        flecha.setLocation(220,250 + (opcion*100)); //posicios de la espada
        
        if (Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0:
                    Greenfoot.setWorld(new Mazmorra1());//selección para empezar o salir
                    break;
                case 1:
                    Greenfoot.stop();
                    break;
            }
        }
    }
}
