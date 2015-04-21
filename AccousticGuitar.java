import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AccousticGuitar here.
 * 
 * @author Jan Kroon 
 * @version 1
 */
public class AccousticGuitar extends Actor
{
    public static int accousticGuitarCount = 0;
    
    public static void anotherAccousticGuitarManufactured() {
       //this.accousticGuitarCount++; // Gaat niet goed, waarom? 
       AccousticGuitar.accousticGuitarCount++;   
    }
    
    /**
     * Act - do whatever the AccousticGuitar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
