package Strategy;

import Strategy.Duck.*;
import Strategy.FlyStrategy.FlyWithWings;
import Strategy.FlyStrategy.NoFly;
import Strategy.QuackStrategy.Mute;
import Strategy.QuackStrategy.Quack;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new FlyWithWings(),new Quack());
        Duck rubberDuck = new RubberDuck(new NoFly(),new Mute());

        mallardDuck.performFly();
        mallardDuck.performQuack();

        rubberDuck.performFly();
        rubberDuck.performQuack();

        mallardDuck.setFlyBehaviour(new NoFly());
        mallardDuck.performFly();
    }
}
