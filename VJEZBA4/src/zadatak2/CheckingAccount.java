package zadatak2;

public class CheckingAccount extends Account {

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing money checking account");
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing money checking account");
        balance -= amount;
    }
}
