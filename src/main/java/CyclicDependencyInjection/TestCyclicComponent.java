package CyclicDependencyInjection;

import dagger.Component;

@Component
public interface TestCyclicComponent {
    ClassA getClassA();
    ClassB getClassB();
}
