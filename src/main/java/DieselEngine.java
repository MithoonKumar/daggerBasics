import javax.inject.Inject;

public class DieselEngine implements Engine {
    private int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting diesel engine with horse power: " + horsePower);
    }
}
