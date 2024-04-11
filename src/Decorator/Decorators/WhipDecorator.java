package Decorator.Decorators;

import Decorator.Beverage.Bevarage;

public class WhipDecorator extends CoffeeDecorator{
    public WhipDecorator(Bevarage bevarage) {
        super(bevarage);
    }

    @Override
    public int calculateCost() {
        return this.bevarage.calculateCost()+40;
    }

    public String getDescription() {
        return this.bevarage.getDescription() + " with Whip";
    }
}
