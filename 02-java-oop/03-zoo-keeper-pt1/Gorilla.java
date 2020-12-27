public class Gorilla extends Mammals {

    public Gorilla (int energyLevel){
        super(energyLevel);
    }

    public void throwSomething(){
        System.out.println("The Gorilla has threw something. You really don't want to know what it threw.");
        energyLevel = energyLevel -5;
        displayEnergyLevel();
    }

    public void eatBananas(){
        System.out.println("The Gorilla devoured the banana and looks rejuvenated.");
        energyLevel = energyLevel +10;
        displayEnergyLevel();
    }

    public void climb(){
        System.out.println("The Gorilla decided to climb a tree and show off its abilities.");
        energyLevel = energyLevel -10;
        displayEnergyLevel();
    }


}
