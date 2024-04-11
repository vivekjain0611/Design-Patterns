package Decorator.Decorators;

import Decorator.Beverage.Bevarage;

public class MochaDecorator extends CoffeeDecorator{
    public MochaDecorator(Bevarage bevarage) {
        super(bevarage);
    }

    @Override
    public int calculateCost() {
        return this.bevarage.calculateCost()+20;
    }

    public String getDescription() {
        return this.bevarage.getDescription() + "with Mocha";
    }
}
