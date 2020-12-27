public class Bat extends Mammals {
    public Bat(int energyLevel){
        super(energyLevel);
    }

    public void fly(){
        System.out.println("Whoosh!, Beware,the bat took off into the air!");
        energyLevel = energyLevel * 3 - 50;
        displayEnergyLevel();
    }

    public void eatHuman(){
        System.out.println("(Someone scream).... Some poor unlucky soul just became food for the bat.");
        energyLevel = energyLevel  + 25;
        displayEnergyLevel();
    }

    public void attackTown(){
        System.out.println("Sounds of the town burning and people screaming echos off in the distance.");
        energyLevel = energyLevel - 100;
        displayEnergyLevel();
    }
}
