package zadatak2;

public class AdditionalEquipment extends CarDecorator {
    public AdditionalEquipment(Car car) {
        super(car);
        description = "Additional equipment";
        cost = 2500; // additional cost
    }
}
