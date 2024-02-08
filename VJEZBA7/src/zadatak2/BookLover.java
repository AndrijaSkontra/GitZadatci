package zadatak2;

public class BookLover {


    private Membership membership;

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public void getMembershipPerks() {
        membership.memberShipPerks();
    }


}
