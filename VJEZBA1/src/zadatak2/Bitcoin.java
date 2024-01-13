package zadatak2;

public class Bitcoin implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Bitcoin");
    }
}
