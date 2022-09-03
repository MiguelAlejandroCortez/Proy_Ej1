import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    
    public ball(int dir)
    {
        setRotation(dir);
    }
    public void act()
    {  
        move(4);
        
        if(atWorldEdge())
            turn(153);
    }
    
    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() -10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() -10)
            return true;
        else
            return false;
    }
}
