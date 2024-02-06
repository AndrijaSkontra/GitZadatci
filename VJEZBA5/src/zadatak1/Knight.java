package zadatak1;

public abstract class Knight {
    protected String description;
    protected int powerLevel;

    public abstract void attack();
    public abstract int getPowerLevel();
    public abstract void avoidBattle();
    public String getDescription() {
        return description;
    }
}