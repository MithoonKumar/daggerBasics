package DirectProviderAndLazyInjection;

import javax.inject.Inject;

public class DirectCounter {

    @Inject
    public Integer value;

    @Inject
    public DirectCounter() {
    }

    void print() {
        System.out.println("printing...");
        System.out.println(value);
        System.out.println(value);
        System.out.println(value);
    }
}
