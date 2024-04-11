package Decorator.Beverage;

public class DarkRoast extends Bevarage{

    public DarkRoast() {
        description = "DarkRoast Coffee";
    }
    @Override
    public int calculateCost() {
        return 200;
    }

}
