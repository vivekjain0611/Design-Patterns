package Decorator.Beverage;

public class HouseBlend extends Bevarage{

    HouseBlend() {
        description = "HouseBlend Coffee";
    }
    @Override
    public int calculateCost() {
        return 300;
    }

}
