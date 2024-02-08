package zadatak3;

public class Apprentice implements IApprentice{
    @Override
    public void askForAdvice() {
        System.out.println("I am asking for advice");
    }

    @Override
    public void bringTools() {
        System.out.println("I am bringing tools");
    }
}
