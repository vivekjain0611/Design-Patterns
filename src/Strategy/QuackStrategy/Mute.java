package Strategy.QuackStrategy;

public class Mute implements QuackBehaviour{
    @Override
    public void performQuack() {
        System.out.println("I dont squeak or quack..");
    }
}
