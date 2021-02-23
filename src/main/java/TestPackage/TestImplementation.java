package TestPackage;

import javax.inject.Inject;

public class TestImplementation implements TestInterface {

    private TestDependency testDependency;

    @Inject
    public TestImplementation(TestDependency testDependency) {
        this.testDependency = testDependency;
    }

    @Override
    public String printSomething() {
        this.testDependency.methodInTestDependency();
        return "Returning some string";
    }
}
