import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public Enemy(){
        setImage("enemy.png");
    }
    
    public void act()
    {
        move(-2);
        if (isAtEdge()) {
            getWorld().removeObject(this);
            
        }
    }
}
