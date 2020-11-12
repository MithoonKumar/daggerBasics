import javax.inject.Inject;

public class Main {
    @Inject
    public Car car;

    public static void main(String[] args) {
        Main main = new Main();
        main.testMethod();
    }

    public void testMethod() {
        CarComponent carComponent = DaggerCarComponent.builder().dieselEngineModule(new DieselEngineModule(100)).build();
        carComponent.inject(this);
        this.car.drive();
    }
}
