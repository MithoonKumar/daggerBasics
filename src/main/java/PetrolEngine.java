import javax.inject.Inject;

public class PetrolEngine implements Engine{

    private int horsePower;

    @Inject
    public PetrolEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("Petrol Engine started with horse power:" + horsePower);
    }
}
