public class testClass {
    public static void main(String[] args) {
        Wizard Merlin = new Wizard();
        Ninja Striker = new Ninja();
        Samurai Kenshin = new Samurai();

        Merlin.fireball(Kenshin);
        Striker.attack(Kenshin);
        Kenshin.attack(Merlin);
        Striker.attack(Merlin);
        Merlin.fireball(Striker);
        Merlin.heal(Merlin);
        Striker.steal(Kenshin);
        Merlin.fireball(Kenshin);
        Kenshin.deathBlow(Merlin);
        Kenshin.meditate();
        Striker.runAway();

    }
}
