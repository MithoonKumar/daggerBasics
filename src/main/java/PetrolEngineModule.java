import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine providesPetrolEngine(PetrolEngine petrolEngine) {
        return petrolEngine;
    }
}
