package zadatak1;

public class AppClient {

    public static void main(String[] args) {

        OnlineStore store = new OnlineStore("Best online store");
        Customer cust1 = new Customer("Fst customer");
        Customer cust2 = new Customer("Snd customer");
        store.setItemAvailable(new Item("Item1", "nice"));
        store.add2AvailableList(cust1);
        store.add2AvailableList(cust2);
        store.notifyCustomers();

    }
}
