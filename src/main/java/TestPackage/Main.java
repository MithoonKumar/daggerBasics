package TestPackage;

import DirectProviderAndLazyInjection.*;

public class Main {

    public static void main(String[] args) {
        DaggerComponent daggerComponent = DaggerDaggerComponent.create();
        TestImplementation testImplementation = daggerComponent.getTestImpelementation();
        testImplementation.printSomething();
    }
}
