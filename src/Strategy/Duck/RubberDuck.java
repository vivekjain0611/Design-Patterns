package Strategy.Duck;

import Strategy.FlyStrategy.FlyBehaviour;
import Strategy.QuackStrategy.QuackBehaviour;

public class RubberDuck extends Duck{
    public RubberDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I look like rubber duck");
    }
}
