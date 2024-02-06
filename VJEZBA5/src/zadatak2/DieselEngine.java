package zadatak2;

public class DieselEngine extends CarDecorator {
    public DieselEngine(Car car) {
        super(car);
        description = "Diesel engine";
        cost = 3000; // additional cost
    }
}
