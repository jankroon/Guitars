import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LesPaul here.
 * 
 * @author Jan Kroon 
 * @version 1
 */
public class LesPaul extends GibsonGuitar
{
   /**
     * Constructor method
     */
    public LesPaul() 
    {
        this.setRotation(70);
        System.out.println("CHECK New guitar manufactured by " + this.manufacturerName);
        ElectricGuitar.anotherElectricGuitarManufactured();
    }    
    
    /**
     * Act method - do whatever the LesPaul wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}