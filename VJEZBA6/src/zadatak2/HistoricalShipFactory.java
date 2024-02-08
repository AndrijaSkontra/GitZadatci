package zadatak2;

public class HistoricalShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new HistoricalShip();
    }
}

