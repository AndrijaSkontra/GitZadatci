package zadatak2;

public class Cash implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using cash");
    }
}
