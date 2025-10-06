/**
 * Write a description of class HealSpell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class HealSpell implements Ability 
{
    public void cast(Character caster, Character target){
        caster.takeDamage(-15);
        System.out.println("Healed 15 HP!");
    }
}
