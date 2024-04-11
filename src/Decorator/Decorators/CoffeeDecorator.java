package Decorator.Decorators;

import Decorator.Beverage.Bevarage;

public abstract class CoffeeDecorator extends Bevarage {

    Bevarage bevarage;

    public CoffeeDecorator(Bevarage bevarage) {
        this.bevarage = bevarage;
    }
    //Dont confuse this with Bevarage class get Description method..Its a different method.
    //If it wouldn't have been there the subclasses of this class would have overridden Beverage class getDescription method
    //which would be a violation of Dependency Inversion Principle.
    public abstract String getDescription();
}
