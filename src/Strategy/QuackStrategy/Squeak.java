package Strategy.QuackStrategy;

public class Squeak implements QuackBehaviour{
    @Override
    public void performQuack() {
        System.out.println("I am squeaking...");
    }
}
