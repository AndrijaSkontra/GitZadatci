package zadatak3;

public class SimulateGame {

    public static void main(String[] args) {
        simulateGame();
    }

    private static void simulateGame() {
        Hero hero1 = new Hero("Superman");
        Hero hero2 = new Hero("Batman");

        Ability ability1 = new DoubleStrenght();
        Ability ability2 = new FastRunning();
        Ability ability3 = new LongDistVision();

        hero1.setAbility(ability1);
        hero2.setAbility(ability2);

        System.out.println(hero1);
        System.out.println(hero2);

        System.out.println("After fighting our heros are changing their abilities!");

        hero1.setAbility(ability2);
        hero2.setAbility(ability3);

        System.out.println(hero1);
        System.out.println(hero2);

    }
}
