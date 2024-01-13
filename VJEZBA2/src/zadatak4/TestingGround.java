package zadatak4;

public class TestingGround {

    public static void main(String[] args) {

        SoftwareEngineer softwareEngineer = new Programmer("John");
        SoftwareEngineer softwareEngineer1 = new Programmer("Jack");
        SoftwareEngineer softwareEngineer2 = new Programmer("Mike");
        SoftwareEngineer softwareEngineer3 = new DataAnalyst("Jill");
        SoftwareEngineer softwareEngineer4 = new DataAnalyst("Bill");
        SoftwareEngineer softwareEngineer5 = new DataAnalyst("Miley");

        OpenSourceProject openSourceProject = new OpenSourceProject();
        openSourceProject.addObserver(softwareEngineer);
        openSourceProject.addObserver(softwareEngineer1);
        openSourceProject.addObserver(softwareEngineer2);
        openSourceProject.addObserver(softwareEngineer3);
        openSourceProject.addObserver(softwareEngineer4);
        openSourceProject.addObserver(softwareEngineer5);

        softwareEngineer1.addToCode(openSourceProject);

        openSourceProject.removeObserver(softwareEngineer);
        openSourceProject.removeObserver(softwareEngineer1);
        openSourceProject.removeObserver(softwareEngineer4);

        System.out.println("---------------------------------------------------");

        softwareEngineer3.addToCode(openSourceProject);
    }
}
