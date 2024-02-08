package zadatak3;

public class Master implements IMaster{
    @Override
    public void askForAdvice() {
        System.out.println("I am asking for advice as a master");
    }

    @Override
    public void bringTools() {
        System.out.println("I am bringing tools as a master");
    }

    @Override
    public void giveAdvice() {
        System.out.println("I am giving advice as a master");
    }

    @Override
    public void repair() {
        System.out.println("I am repairing as a master");
    }
}
