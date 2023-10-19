import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjectSpecial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectSpecial extends Actor
{
    public ObjectSpecial() {
        setImage("object.png");
    }
    
    public void act()
    {
        checkForCollision();
    }
    
    public void checkForCollision() {
        Actor character = getOneIntersectingObject(Character.class);  
        if (character !=null) {
            ((Character) character).increaseScore();
            getWorld().removeObject(this);
        }
    }
}
