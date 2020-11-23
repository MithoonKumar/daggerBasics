package CyclicDependencyInjection;

import dagger.Lazy;

import javax.inject.Inject;

public class ClassA {

    @Inject
    public Lazy<ClassB> classB;

    @Inject
    public ClassA() {
    }
}
