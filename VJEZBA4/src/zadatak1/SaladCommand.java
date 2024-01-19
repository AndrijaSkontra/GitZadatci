package zadatak1;

public class SaladCommand implements Command{

    private Chef chef;

    public SaladCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void cook() {
        chef.makeSalad();
    }
}
