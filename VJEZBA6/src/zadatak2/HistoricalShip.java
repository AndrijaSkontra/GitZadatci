package zadatak2;

public class HistoricalShip implements Ship {
    @Override
    public String getDescription() {
        return "Historical Ship";
    }

    @Override
    public String sail() {
        return "Sailing like a historical ship...";
    }
}