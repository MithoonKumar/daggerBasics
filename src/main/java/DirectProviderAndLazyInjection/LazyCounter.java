package DirectProviderAndLazyInjection;

import dagger.Lazy;

import javax.inject.Inject;

public class LazyCounter {

    @Inject
    public Lazy<Integer> lazy;

    @Inject
    public LazyCounter() {
    }

    void print() {
        System.out.println("printing...");
        System.out.println(lazy.get());
        System.out.println(lazy.get());
        System.out.println(lazy.get());
    }
}
