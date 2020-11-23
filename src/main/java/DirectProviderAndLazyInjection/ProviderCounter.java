package DirectProviderAndLazyInjection;

import javax.inject.Inject;
import javax.inject.Provider;

public class ProviderCounter {

    @Inject
    public Provider<Integer> provider;

    @Inject
    public ProviderCounter() {
    }

    void print() {
        System.out.println("printing...");
        System.out.println(provider.get());
        System.out.println(provider.get());
        System.out.println(provider.get());
    }

}
