import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Player extends Character
{
    private List<Ability> abilities;
    
    public Player() {
        super(100, 5);
        abilities = new ArrayList<>();
        abilities.add(new Fireball());
        abilities.add(new HealSpell());
    }
    
    public void handleMovement(){
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - speed, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + speed, getY());
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - speed);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + speed);
        }
    }
    
    public void handleAbilities(){
        List<AIEnemy> enemies = getWorld().getObjects(AIEnemy.class);
        if(enemies.isEmpty()){
            return;
        }
        
        AIEnemy enemy = enemies.get(0);
        
        if(Greenfoot.isKeyDown("o")){
            abilities.get(0).cast(this, enemy);
            
        }
        if (Greenfoot.isKeyDown("p")) {
            abilities.get(1).cast(this, this);
        }
    }
    
    @Override
    public void update(){
        handleMovement();
        handleAbilities();
    }
    
    @Override
    public void act(){
        update();
    }
}
