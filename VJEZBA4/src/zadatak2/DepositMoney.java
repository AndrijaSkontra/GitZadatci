package zadatak2;

public class DepositMoney implements PaymentServiceInt {
    private Account account;
    private double amount;

    public DepositMoney(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.println("Depositing money " + amount);
        account.deposit(amount);
    }

    @Override
    public void undo() {
        System.out.println("Undoing deposit of money " + amount);
        account.withdraw(amount);
    }
}