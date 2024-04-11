package Strategy.FlyStrategy;

public class NoFly implements FlyBehaviour{

    @Override
    public void performFly() {
        System.out.println("Dont fly...");
    }
}
