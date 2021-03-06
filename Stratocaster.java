import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stratocaster here.
 * 
 * @author Jan Kroon 
 * @version 1
 */
public class Stratocaster extends FenderGuitar
{
    /**
     * Constructor method
     */
    public Stratocaster() 
    {
        this.setRotation(70);
        //System.out.println("CHECK current rotation: " + String.valueOf(this.getRotation()));
        System.out.println("CHECK New guitar manufactured by " + this.manufacturerName);
        ElectricGuitar.anotherElectricGuitarManufactured();
    }    
    
    /**
     * Act method - do whatever the Fender_Stratocaster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //this.playSound(this.sampleSoundFile);
        Greenfoot.playSound("FenderStratocaster.mp3");
    }    
}
