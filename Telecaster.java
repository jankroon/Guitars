import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Telecaster here.
 * 
 * @author Jan Kroon 
 * @version 1
 */
public class Telecaster extends FenderGuitar
{
    /**
     * Constructor method
     */
    public Telecaster() 
    {
        this.setRotation(70);
        System.out.println("CHECK New guitar manufactured by " + this.manufacturerName);
        ElectricGuitar.anotherElectricGuitarManufactured();
    }    
    /**
     * Act method - do whatever the Telecaster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
