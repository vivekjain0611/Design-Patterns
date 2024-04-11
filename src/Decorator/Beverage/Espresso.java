package Decorator.Beverage;

public class Espresso extends Bevarage{

    public Espresso() {
        description="Espresso Coffee";
    }

    @Override
    public int calculateCost() {
        return 200;
    }

}
