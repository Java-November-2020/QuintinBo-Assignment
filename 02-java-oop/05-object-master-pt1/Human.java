public class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;
    private String name = this.name;

    public Human(){

    }


    public void attack(Human target){
        target.health = health - this.strength;
        System.out.println("You attack " + target);
        System.out.println(" " + target + " health is now at " + target.health);
    }

}
