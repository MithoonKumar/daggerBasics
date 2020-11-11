public class Main {
    private static Car car;

    public static void main(String[] args) {
        CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();
        car.drive();
    }
}
