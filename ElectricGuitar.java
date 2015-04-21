import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ElectricGuitar here.
 * 
 * @author Jan Kroon 
 * @version 1
 */
public abstract class ElectricGuitar extends Actor
{
    public static int electricGuitarCount = 0;
    
    public static void anotherElectricGuitarManufactured() {
       //this.electricGuitarCount++; // Gaat niet goed, waarom? 
       ElectricGuitar.electricGuitarCount++;
       System.out.println("CHECK Number of electric guitars BackStage: " + String.valueOf(ElectricGuitar.electricGuitarCount));
    }
    
    /**
     * Act - do whatever the ElectricGuitar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
