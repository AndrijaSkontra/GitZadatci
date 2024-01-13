package zadatak2;

public class MaestroCard implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Maestro Card");
    }
}
