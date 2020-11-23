package CyclicDependencyInjection;

import javax.inject.Inject;

public class ClassB {

    @Inject
    public ClassA classA;

    @Inject
    public ClassB() {
    }
}
