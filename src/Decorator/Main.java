package Decorator;

import Decorator.Beverage.Bevarage;
import Decorator.Beverage.DarkRoast;
import Decorator.Decorators.SoyDecorator;
import Decorator.Decorators.WhipDecorator;

public class Main {
    public static void main(String[] args) {
        Bevarage bevarage = new SoyDecorator(new WhipDecorator(new DarkRoast()));
        int cost = bevarage.calculateCost();
        System.out.println("Cost :"+cost);
        System.out.println("Description: "+bevarage.getDescription());
    }
}
