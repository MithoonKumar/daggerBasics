import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();

    void inject(Main main);
}
