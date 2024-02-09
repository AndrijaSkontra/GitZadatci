package zadatak2;

public class Simulator {
    public static void main(String[] args) {
        ShipFactory shipFactory = new HistoricalShipFactory();
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getDescription());
        System.out.println(ship.sail());

        shipFactory = new ModernShipFactory();
        ship = shipFactory.createShip();
        System.out.println(ship.getDescription());
        System.out.println(ship.sail());
        System.out.println("Done");
    }
}