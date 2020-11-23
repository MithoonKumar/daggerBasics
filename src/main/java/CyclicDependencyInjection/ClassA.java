package CyclicDependencyInjection;

import javax.inject.Inject;

public class ClassA {

    @Inject
    public ClassB classB;

    @Inject
    public ClassA() {
    }
}
