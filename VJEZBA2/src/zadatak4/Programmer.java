package zadatak4;

public class Programmer implements SoftwareEngineer {

    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public void addToCode(OpenSourceProject project) {
        project.setCode("Programmer committed changes...");
    }

    @Override
    public void update() {
        System.out.println("ALERT PROGRAMMER: " + name + ", CODE HAS BEEN CHANGED!");
    }

    @Override
    public String getName() {
        return name;
    }
}
