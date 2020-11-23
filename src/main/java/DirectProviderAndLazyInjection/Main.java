package DirectProviderAndLazyInjection;

public class Main {

    public static void main(String[] args) {
        TestComponent testComponent = DaggerTestComponent.create();
        DirectCounter directCounter = testComponent.getDirectCounter();
        ProviderCounter providerCounter = testComponent.getProviderCounter();
        LazyCounter lazyCounter = testComponent.getLazyCounter();
        directCounter.print();
        providerCounter.print();
        lazyCounter.print();
    }
}
