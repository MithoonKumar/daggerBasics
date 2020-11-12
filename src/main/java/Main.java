import javax.inject.Inject;

public class Main {
    @Inject
    public Car car1, car2;

    public static void main(String[] args) {
        Main main = new Main();
        main.testMethod();
    }

    public void testMethod() {
        CarComponent carComponent = DaggerCarComponent.builder().horsePower(1).engineCapacity(100).build();
        carComponent.inject(this);
        this.car1.drive();
        this.car2.drive();
    }
}
