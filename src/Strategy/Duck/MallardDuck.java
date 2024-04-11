package Strategy.Duck;

import Strategy.FlyStrategy.FlyBehaviour;
import Strategy.QuackStrategy.QuackBehaviour;

public class MallardDuck extends Duck{
    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour,quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I look like Mallard duck");
    }
}
