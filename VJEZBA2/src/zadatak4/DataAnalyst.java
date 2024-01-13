package zadatak4;

public class DataAnalyst implements SoftwareEngineer{

    private String name;

    public DataAnalyst(String name) {
        this.name = name;
    }

    @Override
    public void addToCode(OpenSourceProject project) {
        project.setCode("DataAnalyst committed changes...");
    }

    @Override
    public void update() {
        System.out.println("ALERT DATA ANALYST, " + name + " CODE HAS BEEN CHANGED!");
    }

    @Override
    public String getName() {
        return name;
    }
}
