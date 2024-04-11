package Strategy.QuackStrategy;

public class Quack implements QuackBehaviour{
    @Override
    public void performQuack() {
        System.out.println("I am quacking..");
    }
}
