package zadatak1;

public class FstRangKnight extends KnightDecorator {
    public FstRangKnight(Knight knight) {
        super(knight);
        description = "First Rank Knight";
        powerLevel = 10;
    }

    public void attack() {
        System.out.println("First Rank Knight attacks with a knife and a sword.");
    }

    public int getPowerLevel() {
        return knight.getPowerLevel() + powerLevel;
    }

    public void avoidBattle() {
        System.out.println("First Rank Knight avoids battle by walking fast.");
    }
}