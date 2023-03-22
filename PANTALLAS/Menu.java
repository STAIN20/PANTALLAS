import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        addObject(new Salir(),300,320); //Ubicación de las selecciones
        addObject(flecha,220,250);
    }
    
    public void act() {
        checkKeys();
    }
    
    private void checkKeys() {
        if (Greenfoot.isKeyDown("UP")) { 
            opcion = 0;
        }
        
        if (Greenfoot.isKeyDown("DOWN")) {
            opcion = 1;
        }
        
        flecha.setLocation(220,250 + (opcion * 70)); // La posición de la espada cambia según la opción
        
        if (Greenfoot.isKeyDown("ENTER")) {
            switch(opcion) {
                case 0:
                    Greenfoot.setWorld(new Mazmorra1());// selección para empezar o salir
                    break;
                case 1:
                    Greenfoot.stop(); // Paramos el juego
                    break;
            }
        }
    }
}
