package zadatak2;

public class ModernShip implements Ship {
    @Override
    public String getDescription() {
        return "Modern Ship";
    }

    @Override
    public String sail() {
        return "Sailing like a modern ship...";
    }
}