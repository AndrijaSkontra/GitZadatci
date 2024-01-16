package zadatak2;

public class OldPloterAdapter implements NewPloterTechnology{

    private OldPloterTechnology oldPloterTechnology;

    public OldPloterAdapter(OldPloterTechnology oldPloterTechnology) {
        this.oldPloterTechnology = oldPloterTechnology;
    }

    @Override
    public void graphicsPrint() {
        oldPloterTechnology.ploterGraphics();
    }
}
