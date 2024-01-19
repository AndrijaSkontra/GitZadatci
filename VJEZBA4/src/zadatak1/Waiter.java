package zadatak1;

public class Waiter {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void orderUp() {
        command.cook();
    }
}
