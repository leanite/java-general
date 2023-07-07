package classes;

import org.jetbrains.annotations.NotNull;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public Car(String brand, String model, String color, int doors, boolean convertible) {
        this.setBrand(brand);
        this.setModel(model);
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }

    public Car() {
        this("", "", "", 0, false);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(@NotNull String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) //returns on first statement and prevents NullPointerException
            this.model = "N/A";
        else
            this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(@NotNull String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void isConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describe() {
        System.out.print(doors > 2 ? doors+"-Door " : "");
        System.out.println(
                color + " " +
                brand + " " +
                model + " " +
                (convertible ? "Convertible" : "")
        );
    }
}
