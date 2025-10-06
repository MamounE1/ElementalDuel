/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Fireball implements Ability 
{
    public void cast(Character caster, Character target){
        target.takeDamage(20);
        System.out.println("Fireball hits!");
    }
}
