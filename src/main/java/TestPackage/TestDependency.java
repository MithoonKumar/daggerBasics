package TestPackage;

import javax.inject.Inject;

public class TestDependency {

    @Inject
    public TestDependency() {
    }

    public void methodInTestDependency() {
        System.out.println("Printing from test dependency");
    }
}
