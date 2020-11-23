package DirectProviderAndLazyInjection;

import dagger.Component;

@Component(modules = {CounterModule.class})
public interface TestComponent {
    DirectCounter getDirectCounter();
    ProviderCounter getProviderCounter();
    LazyCounter getLazyCounter();
}
