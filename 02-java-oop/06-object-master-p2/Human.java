public class Human {
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

    public Human(){

    }


    public void attack(Human target){
        target.health = target.health - this.strength;
        System.out.println("You attack " + target);
        System.out.println(" " + target + " health is now at " + target.health);
    }

}
