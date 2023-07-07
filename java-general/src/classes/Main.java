package classes;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.describe();

        Car c2 = new Car("Fiat", "Pulse", "Gray", 4, false);
        c2.describe();
    }
}
