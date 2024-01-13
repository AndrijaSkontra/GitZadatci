package zadatak3;

public class Hero {

    private String name;
    private Ability ability;

    public Hero(String name) {
        this.name = name;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", ability=" + ability +
                '}';
    }
}
