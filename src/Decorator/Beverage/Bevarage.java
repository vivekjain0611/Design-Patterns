package Decorator.Beverage;

public abstract class Bevarage {

    String description = "Unknown Bevarage";
    public abstract int calculateCost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
