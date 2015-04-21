import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarlosSantana here.
 * 
 * @author Jan Kroon 
 * @version 1
 */
public class CarlosSantana extends PaulReedSmithGuitar implements SixStringGuitar2
{
    /**
     * Constructor method
     */
    public CarlosSantana() 
    {
        this.setRotation(70);
        System.out.println("CHECK New guitar manufactured by " + this.manufacturerName);
        ElectricGuitar.anotherElectricGuitarManufactured();
    }    
    
    /**
     * Act method - do whatever the CarlosSantana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void arpeggioPlay() {
        System.out.println("E A D G B E");
    }
}
