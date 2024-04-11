package Decorator.Decorators;

import Decorator.Beverage.Bevarage;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Bevarage bevarage) {
        super(bevarage);
    }

    @Override
    public int calculateCost() {
        return this.bevarage.calculateCost()+10;
    }

    public String getDescription() {
        return this.bevarage.getDescription() + "with Milk";
    }
}
