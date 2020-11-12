import javax.inject.Inject;

public class PetrolEngine implements Engine{
    
    @Inject
    public PetrolEngine() {
    }

    @Override
    public void startEngine() {
        System.out.println("Petrol Engine started");
    }
}
