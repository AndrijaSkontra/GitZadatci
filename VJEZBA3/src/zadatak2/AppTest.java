package zadatak2;

public class AppTest {

    public static void main(String[] args) {

        var ploterUser = new PloterUser(new PloterLatestVersion());

        ploterUser.usePloter();

        System.out.println("\nThe need for using old ploter technology emerges\n");

        ploterUser.setNewPloterTehnology(new OldPloterAdapter(new PloterAlphaVersion()));
        ploterUser.usePloter();
    }
}
