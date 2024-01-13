package zadatak1;

public class Customer {

    private String name;
    private int id;
    private static int cntId;

    public Customer(String name) {
        this.name = name;
        id = cntId++;
    }

    public void update(Item item, String storeName) {
        System.out.println("Customer:");
        System.out.println(this);
        System.out.println("-------------------");
        System.out.println("Item: " + item);
        System.out.println("Is now available!");
        System.out.println("====================");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
