package classes.oop;

public class Mage extends Character {
    public Mage(String name) {
        super(name, 200, 100, 20, 10, 20, 10);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacked! Damage: " + attack * 0.5 + " points");
    }

    @Override
    public void defend() {
        System.out.println(name + " defended! Blocked: " + defense * 0.5 + " points");
    }

    public void magic() {
        System.out.println(name + " used magic! Damage: " + magic * 2 + " points");
    }
}
