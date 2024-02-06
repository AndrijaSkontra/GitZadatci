package zadatak1;

public class RPGGame {
    public static void main(String[] args) {
        Knight knight = new SimpleKnight();
        System.out.println(knight.getDescription() + " Power Level: " + knight.getPowerLevel());
        knight.attack();
        knight.avoidBattle();

        knight = new FstRangKnight(knight);
        System.out.println(knight.getDescription() + " Power Level: " + knight.getPowerLevel());
        knight.attack();
        knight.avoidBattle();

        knight = new SndRangKnight(knight);
        System.out.println(knight.getDescription() + " Power Level: " + knight.getPowerLevel());
        knight.attack();
        knight.avoidBattle();
    }
}
