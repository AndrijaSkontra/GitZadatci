package zadatak1;

public class SimpleKnight extends Knight {
    public SimpleKnight() {
        description = "Simple Knight";
        powerLevel = 10;
    }

    public void attack() {
        System.out.println("Simple Knight attacks with bare hands.");
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void avoidBattle() {
        System.out.println("Simple Knight avoids battle by walking away.");
    }
}