package zadatak2;

public class PloterUser {

    private NewPloterTechnology newPloterTehnology;

    public PloterUser(NewPloterTechnology newPloterTehnology) {
        this.newPloterTehnology = newPloterTehnology;
    }

    public void setNewPloterTehnology(NewPloterTechnology newPloterTehnology) {
        this.newPloterTehnology = newPloterTehnology;
    }

    public void usePloter() {
        newPloterTehnology.graphicsPrint();
    }
}
