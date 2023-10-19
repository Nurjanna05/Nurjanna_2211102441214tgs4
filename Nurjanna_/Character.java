import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    private int score = 0;
    private GreenfootImage[] characterImage;
    //Untuk animasi karakter
    private int animationIndex =0;
    
    public Character(){
        //inisialisasi array gambar animasi karakter
        
        setImage("Character.png");
    }
    
    public void act() {
        move(3);
        checkForCollision();
    }
    
    public void checkForCollision() {
        Actor object = getOneIntersectingObject(ObjectSpecial.class);
        if (object != null) {
            increaseScore();
            getWorld().removeObject(object);
        }
    }
    public void increaseScore(){
        score += 10;
        getWorld().showText("Score: "+ score, 50, 25);
    }
    
    
    
    
}
