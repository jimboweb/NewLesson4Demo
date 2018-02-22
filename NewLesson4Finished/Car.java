import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    int speed = 5;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.isKeyDown("right")){
           setRotation(0);
           move(speed);
       }
       if(Greenfoot.isKeyDown("down")){
           setRotation(90);
           move(speed);
       }
       if(Greenfoot.isKeyDown("left")){
           setRotation(180);
           move(speed);
       }
       if(Greenfoot.isKeyDown("up")){
           setRotation(-90);
           move(speed);
       }
       removeTouching(Pizza.class);
    }    
    
}
