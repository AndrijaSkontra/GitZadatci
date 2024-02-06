package zadatak2;

public abstract class CarDecorator extends Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", " + description;
    }

    @Override
    public double getCost() {
        return car.getCost() + cost;
    }
}