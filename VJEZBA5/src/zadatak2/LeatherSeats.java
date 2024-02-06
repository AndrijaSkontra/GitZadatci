package zadatak2;

 public class LeatherSeats extends CarDecorator {
    public LeatherSeats(Car car) {
        super(car);
        description = "Leather seats";
        cost = 2000; // additional cost
    }
}
