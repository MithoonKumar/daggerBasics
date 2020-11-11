import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims providesRims() {
        return new Rims();
    }

    @Provides
    static Tires providesTires() {
        Tires tires = new Tires();
        tires.inflateTires();
        return tires;
    }

    @Provides
    static Wheels providesWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
