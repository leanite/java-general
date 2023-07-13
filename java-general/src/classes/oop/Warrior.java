package classes.oop;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 200, 100, 20, 0, 20, 10);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacked! Damage: " + attack * 1.5 + " points");
    }

    @Override
    public void defend() {
        System.out.println(name + " defended! Blocked: " + defense * 1.5 + " points");
    }
}
