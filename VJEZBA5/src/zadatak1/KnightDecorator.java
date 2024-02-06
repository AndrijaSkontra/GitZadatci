package zadatak1;

public abstract class KnightDecorator extends Knight {
    protected Knight knight;

    public KnightDecorator(Knight knight) {
        this.knight = knight;
    }

    public void attack() {
        knight.attack();
    }

    public int getPowerLevel() {
        return knight.getPowerLevel();
    }

    public void avoidBattle() {
        knight.avoidBattle();
    }

    public String getDescription() {
        return knight.getDescription() + ", " + description;
    }
}