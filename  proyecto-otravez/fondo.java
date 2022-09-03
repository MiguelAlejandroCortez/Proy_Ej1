import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fondo extends World
{
    public fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        ball ball = new ball(180);
        addObject(ball,30,25);
        ball.setLocation(21,13);
        ball.setLocation(7,9);
        ball.setLocation(16,13);
        ball.setLocation(23,28);
        ball.setLocation(31,25);
        ball.setLocation(29,25);
        ball.setLocation(24,39);
        ball.setLocation(7,7);
        ball.setLocation(32,16);
        ball.setLocation(35,18);
        ball.setLocation(24,24);
    }
}
