import greenfoot.*;
import java.util.*;

/**
 * Write a description of class AIEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class AIEnemy extends Character 
{
    private List<Ability> abilities;
    
    public AIEnemy(){
        super(100, 4);
        abilities = new ArrayList<>();
        abilities.add(new Fireball());
        abilities.add(new HealSpell());
    }
    
    public void autoMove(Player player){
        int dx = player.getX() - getX();
        int dy = player.getY() - getY();
        double distance = Math.sqrt(dx*dx + dy*dy);
        double minDistance = 50;
        
        if(distance > minDistance){
            int moveX = (int) Math.round(speed * dx /distance);
            int moveY = (int) Math.round(speed * dy / distance);
            setLocation(getX() + moveX, getY() + moveY);
        }
        else{
            int jitterX = Greenfoot.getRandomNumber(3) - 1;
            int jitterY = Greenfoot.getRandomNumber(3) - 1;
            setLocation(getX() + jitterX, getY() + jitterY);
        }
    }
    
    public void autoCast(Player player){
        if(Greenfoot.getRandomNumber(100) < 5){
            abilities.get(0).cast(this, player);
        }
        if(getHealth() < 50 && Greenfoot.getRandomNumber(100) < 10){
            abilities.get(1).cast(this, this);
        }
    }
    
    @Override
    public void update(){
        List<Player> players = getWorld().getObjects(Player.class);
        if(players.isEmpty()){
            return;
        }
        
        Player player = players.get(0);
        
        autoMove(player);
        autoCast(player);
    }
    
    @Override
    public void act(){
        update();
    }
}
