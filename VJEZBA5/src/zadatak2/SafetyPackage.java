package zadatak2;

public class SafetyPackage extends CarDecorator {
    public SafetyPackage(Car car) {
        super(car);
        description = "Safety package";
        cost = 1500; // additional cost
    }
}