import greenfoot.Actor;

/**
 * This class extends character to provide functionality for all characters in the game
 * 
 * @author (Mamoun Elmamoun) 
 * @version (1.0)
 */
abstract class Character extends Actor {
    protected int health;
    protected int speed;
    
    public Character(int health, int speed){
        this.health = health;
        this.speed = speed;
    }
    
    public abstract void update();
    
    public void takeDamage(int dmg) {
        health -= dmg;
        if (health < 0){
            health = 0;
        }
    }
    
    public int getHealth() {
        return health;
    }
}
