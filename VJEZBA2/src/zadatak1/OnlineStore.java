package zadatak1;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class OnlineStore implements Observable{

    private String storeName;
    private int storeId;
    private ArrayList<Customer> customers;
    private Item item;

    public OnlineStore(String storeName) {
        this.storeName = storeName;
        customers = new ArrayList<Customer>();
        this.storeId = ThreadLocalRandom.current().nextInt(2000);
    }

    public void setItemAvailable(Item item) {
        this.item = item;
    }

    @Override
    public void add2AvailableList(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void removeFromAvailableList(Customer customer) {
        if (customers.contains(customer)) {
            customers.remove(customer);
        } else {
            System.out.println("Customer not found!");
        }
    }

    @Override
    public void notifyCustomers() {
        for (Customer customer : customers) {
            customer.update(item, storeName);
        }
    }
}
