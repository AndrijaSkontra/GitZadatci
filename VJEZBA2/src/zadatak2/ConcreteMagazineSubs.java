package zadatak2;

public class ConcreteMagazineSubs implements MagazineSubscriber{

    private String name;

    public ConcreteMagazineSubs(String name) {
        this.name = name;
    }

    @Override
    public void update(Magazines magazine) {
        System.out.println(name + " -> notified about " + magazine.name());
    }
}
