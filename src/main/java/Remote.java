import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote() {

    }

    public void addRemote (Car car) {
        System.out.println("Adding remote to the car");
    }
}
