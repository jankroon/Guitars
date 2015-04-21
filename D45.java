import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class D45 here.
 * 
 * @author Jan Kroon 
 * @version 1
 */
public class D45 extends MartinGuitar implements SixStringGuitars
{
    /**
     * Constructor method
     */
    public D45() 
    {
        this.setRotation(70);
        System.out.println("CHECK New guitar manufactured by " + this.manufacturerName);
    }    
    
    /**
     * Act method - do whatever the D45 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Greenfoot.playSound("MartinD45.wav");
    }  
    
    public void arpeggioOnSixStrings() {
        System.out.println("E A D G B E");
    }
}
