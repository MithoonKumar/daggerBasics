import javax.inject.Inject;

public class Car {

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        this.engine.startEngine();
        System.out.println("Driving");
    }

    @Inject
    public void addRemoteToThisCar(Remote remote) {
        remote.addRemote(this);
    }
}
