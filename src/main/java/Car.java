import javax.inject.Inject;

public class Car {

    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Engine engine, Wheels wheels, Driver driver) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    public void drive() {
        this.engine.startEngine();
        System.out.println("Driving being done by driver:" + driver);
    }

    @Inject
    public void addRemoteToThisCar(Remote remote) {
        remote.addRemote(this);
    }
}
