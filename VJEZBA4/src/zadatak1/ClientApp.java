package zadatak1;

public class ClientApp {

    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        Command pizzaCommand = new PizzaCommand(chef);
        Command pastaCommand = new PastaCommand(chef);
        Command saladCommand = new SaladCommand(chef);

        waiter.setCommand(pizzaCommand);
        waiter.orderUp();

        waiter.setCommand(pastaCommand);
        waiter.orderUp();

        waiter.setCommand(saladCommand);
        waiter.orderUp();
    }
}
