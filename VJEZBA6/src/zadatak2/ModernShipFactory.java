package zadatak2;

public class ModernShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new ModernShip();
    }
}