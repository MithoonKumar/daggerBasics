package TestPackage;

import dagger.Component;

@Component
public interface DaggerComponent {
    TestImplementation getTestImpelementation();
}
