package zadatak2;

import java.util.Stack;

public class MobAppInvoker {
    private Stack<PaymentServiceInt> history = new Stack<>();

    public void executeCommand(PaymentServiceInt command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            PaymentServiceInt command = history.pop();
            command.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }

    public void redo() {
        if (!history.isEmpty()) {
            PaymentServiceInt command = history.peek();
            command.execute();
        } else {
            System.out.println("No commands to redo.");
        }
    }
}
