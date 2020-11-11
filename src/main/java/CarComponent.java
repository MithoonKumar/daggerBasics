import dagger.Component;

@Component(modules = WheelsModule.class)
public interface CarComponent {
    Car getCar();

    void inject(Main main);
}
