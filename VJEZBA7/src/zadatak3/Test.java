package zadatak3;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        var supremeMaster = new SupremeMaster();
        var master = new Master();
        var apprentice = new Apprentice();

        System.out.println("These guys can give advice and repair");
        ArrayList<IMaster> masters = new ArrayList<>();
        masters.add(master);
        masters.add(supremeMaster);

        for (IMaster masterInList : masters) {
            masterInList.repair();
            masterInList.giveAdvice();
        }

        System.out.println("These can ask for advice:");

        ArrayList<IApprentice> workers = new ArrayList<>();
        workers.add(apprentice);
        workers.add(master);
        workers.add(supremeMaster);

        for (IApprentice apprenticeInList : workers) {
            apprenticeInList.askForAdvice();
        }

    }
}
