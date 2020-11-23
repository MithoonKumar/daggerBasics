package CyclicDependencyInjection;

public class Main {

    public static void main(String[] args) {
        TestCyclicComponent testCyclicComponent = DaggerTestCyclicComponent.create();
        testCyclicComponent.getClassA();
    }
}
