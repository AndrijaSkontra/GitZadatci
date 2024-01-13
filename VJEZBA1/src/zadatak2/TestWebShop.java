package zadatak2;

public class TestWebShop {

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.setPayment(new Bitcoin());
        /*webShop.setPayment(new Cash());
        webShop.setPayment(new MaestroCard());
        webShop.setPayment(new PayPal());*/
        webShop.addKeyboardToCart();
        webShop.addMouseToCart();
        webShop.addKeyboardToCart();
        webShop.addPcToCart();
        webShop.addMonitorToCart();
        webShop.payInShop();
    }
}
