package zadatak2;

public class WithdrawMoney implements PaymentServiceInt {
    private Account account;
    private double amount;

    public WithdrawMoney(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        System.out.println("Withdrawing money " + amount);
        account.withdraw(amount);
    }

    @Override
    public void undo() {
        System.out.println("Undoing withdrawal of money " + amount);
        account.deposit(amount);
    }
}
