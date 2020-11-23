package DirectProviderAndLazyInjection;

import dagger.Module;
import dagger.Provides;

@Module
public class CounterModule {

    public Integer next = 100;

    @Provides
    public Integer getInteger() {
        System.out.println("Computing the value of next");
        return next++;
    }
}
