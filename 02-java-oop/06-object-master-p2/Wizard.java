public class Wizard extends Human {
    protected int defHealth = 50;
    protected int defIntelligence = 8;


    public Wizard(){

    }
    public void heal(Human target){
        target.health = target.health + this.defIntelligence;
        System.out.println("The wizard heals " + target + " for " + this.defIntelligence);
        System.out.println(" " + target + " health is now at " + target.health);
    }

    public void fireball(Human target){
        target.health = target.health - this.defIntelligence * 3;
        System.out.println("The wizard conjures and hurls a massive fireball");
        System.out.println(" " + target + " health is now at " + target.health);
    }
}
