package zadatak2;

public class TestApp {

    public static void main(String[] args) {

        BookLover bookLover = new BookLover();
        Membership membership = new GoldMembership();
        bookLover.setMembership(membership);
        bookLover.getMembershipPerks();

        System.out.println("=====================================");
        System.out.println("User decides to change membership to Silver");
        bookLover.setMembership(new SilverMembership());
        bookLover.getMembershipPerks();
    }
}
