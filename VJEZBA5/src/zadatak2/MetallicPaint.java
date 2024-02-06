package zadatak2;

public class MetallicPaint extends CarDecorator {
    public MetallicPaint(Car car) {
        super(car);
        description = "Metallic paint";
        cost = 1000; // additional cost
    }
}
