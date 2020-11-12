import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(Main main);

//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder horsePower(int horsePower);
//
//        CarComponent build();
//    }
}
