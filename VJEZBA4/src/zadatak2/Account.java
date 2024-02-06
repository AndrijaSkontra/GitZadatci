package zadatak2;

public abstract class Account {
    protected double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
