package zadatak2;

public class PayPal implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}
