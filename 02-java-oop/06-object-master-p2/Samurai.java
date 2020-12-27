public class Samurai extends Human {
    protected static int defHealth = 200;
    protected static int samuraiCount = 0;

    public Samurai(){
        this.health = Samurai.defHealth;
        Samurai.samuraiCount++;
    }


    public void deathBlow(Human target){
        target.health = 0;
        this.health = this.health / 2;
        System.out.println("You perform a deadly move on " + target);
        System.out.println(" " + target + " has died and in the process you manage to injure yourself.");
        System.out.println("Your health is now at " + this.health);
    }

    public void meditate(){
        this.health = this.health + (this.health / 2);
        System.out.println("You enter a Zen mode channeling your energy and healing you for " + this.health / 2);
    }

    public int howMany(){
        return Samurai.samuraiCount;
    }
}
