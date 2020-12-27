public class Ninja extends Human {
    protected int defStealth = 10;

    public Ninja(){

    }

    public void steal(Human target){
        target.health = target.health - this.defStealth;
        this.health = this.health + this.defStealth;
        System.out.println("The sneaky ninja stole your vitality and added it to his own");
        System.out.println(" " + target + " health is now at " + target.health);
        System.out.println("Your health is now at " + this.health);
    }

    public void runAway(){
        this.health = this.health - 10;
        System.out.println("Your health is now at " + this.health);
    }
}
