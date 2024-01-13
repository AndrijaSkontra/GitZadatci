package zadatak2;

import java.util.ArrayList;

public class WebShop {

    private Payment payment;
    private ArrayList<String> cart;
    private int amount;

    public WebShop() {
        this.cart = new ArrayList<>();
        amount = 0;
        System.out.println("HELLO TO MY WEBSHOP\nPRICES:" +
                "MONITOR = 20\nMOUSE = 10\nKEYBOARD = 15\nPC = 100" +
                "\nDON'T FORGET TO SET PAYMENT OPTION!\n");
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void addMonitorToCart() {
        cart.add("Monitor");
        amount += 20;
    }

    public void addMouseToCart() {
        cart.add("Mouse");
        amount += 10;
    }

    public void addKeyboardToCart() {
        cart.add("Keyboard");
        amount += 15;
    }

    public void addPcToCart() {
        cart.add("PC");
        amount += 100;
    }

    public void payInShop() {
        payment.pay(amount);
        System.out.println("YOUR BILL: " + cart + "\nTOTAL: " + amount);
        cart.clear();
        amount = 0;
    }


}
