package zadatak1;

public class PizzaCommand implements Command{

    private Chef chef;

    public PizzaCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void cook() {
        chef.makePizza();
    }
}
