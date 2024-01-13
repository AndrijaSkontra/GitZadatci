package zadatak1;

public interface Observable {

    void add2AvailableList(Customer customer);
    void removeFromAvailableList(Customer customer);
    void notifyCustomers();
}
