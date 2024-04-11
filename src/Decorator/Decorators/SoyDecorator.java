package Decorator.Decorators;

import Decorator.Beverage.Bevarage;

public class SoyDecorator extends CoffeeDecorator{
    public SoyDecorator(Bevarage bevarage) {
        super(bevarage);
    }

    @Override
    public int calculateCost() {
        return this.bevarage.calculateCost()+30;
    }

    public String getDescription() {
        return this.bevarage.getDescription() + "with Soy";
    }
}
