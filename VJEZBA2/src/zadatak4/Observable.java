package zadatak4;

public interface Observable {

    void addObserver(SoftwareEngineer observer);

    void removeObserver(SoftwareEngineer observer);

    void notifyObservers();
}
