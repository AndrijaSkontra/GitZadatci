package zadatak2;

public class ForeignCurrencyAccount extends Account {

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing foreign currency");
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing foreign currency");
        balance -= amount;
    }
}
