package zadatak4;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class OpenSourceProject implements Observable{

    private String code;
    private ArrayList<SoftwareEngineer> observers;
    private PropertyChangeSupport support;

    public OpenSourceProject() {
        this.code = "THIS IS A OPEN SOURCE PROJECT\n";
        observers = new ArrayList<>();
        support = new PropertyChangeSupport(this);
        support.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                notifyObservers();
            }
        });
    }

    @Override
    public void addObserver(SoftwareEngineer observer) {
        if(!observers.contains(observer)) {
            observers.add(observer);
        } else {
            System.out.println("Observer already exists!");
        }
    }

    @Override
    public void removeObserver(SoftwareEngineer observer) {
        if(observers.contains(observer)) {
            observers.remove(observer);
        } else {
            System.out.println("Observer doesn't exist!");
        }
    }

    @Override
    public void notifyObservers() {
        for (SoftwareEngineer observer : observers) {
            observer.update();
        }
    }

    public void setCode(String newCode) {
        String oldCode = this.code;
        this.code = newCode;
        this.support.firePropertyChange("code", oldCode, newCode);
    }
}
