package zadatak5;

public class AppClient {

    public static void main(String[] args) {

CarManipulation car = new CarManipulation() {
            @Override
            public void startCar() {
                System.out.println("Car is started.");
            }

            @Override
            public void stopCar() {
                System.out.println("Car is stopped.");
            }
        };

        AirplaneManipulation airplane = new AirplaneManipulation() {
            @Override
            public void flyThePlane() {
                System.out.println("Airplane is flying.");
            }

            @Override
            public void landThePlane() {
                System.out.println("Airplane is landed.");
            }
        };

        HelicopterManipulation helicopter = new HelicopterManipulation() {
            @Override
            public void flyTheHelicopter() {
                System.out.println("Helicopter is flying.");
            }

            @Override
            public void landTheHelicopter() {
                System.out.println("Helicopter is landed.");
            }
        };

        car.startCar();
        car.stopCar();

        airplane.flyThePlane();
        airplane.landThePlane();

        helicopter.flyTheHelicopter();
        helicopter.landTheHelicopter();
    }
}
