package zadatak2;

public class Run {

    public static void main(String[] args) {
        Car car = new BasicCar();
        System.out.println(car.getDescription() + " $" + car.getCost());

        Car car2 = new BasicCar();
        car2 = new SafetyPackage(car2);
        System.out.println(car2.getDescription() + " $" + car2.getCost());

        Car car3 = new BasicCar();
        car3 = new SafetyPackage(car3);
        car3 = new LeatherSeats(car3);
        System.out.println(car3.getDescription() + " $" + car3.getCost());

        Car car4 = new BasicCar();
        car4 = new SafetyPackage(car4);
        car4 = new LeatherSeats(new MetallicPaint(new DieselEngine(new AdditionalEquipment(car4))));
        System.out.println(car4.getDescription() + " $" + car4.getCost());
    }
}
