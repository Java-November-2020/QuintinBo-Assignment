public class Mammals {
    public int energyLevel = 100;

    public Mammals(int energyLevel) {

    }

    public int displayEnergyLevel(){
        System.out.println("The energy level is currently at " + energyLevel);
        return energyLevel;
    }
}
