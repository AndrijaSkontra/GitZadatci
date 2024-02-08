package zadatak1.kod;

public class Test {

    public static void main(String[] args) {
        User user = new User();
        user.setBookingService(new Booking() {
            @Override
            public void book(Apartment apartment) {
                System.out.println("Apartment " + apartment + " booked");
            }

            @Override
            public void cancel(Apartment apartment) {
                System.out.println("Apartment " + apartment + " canceled");
            }
        });
        user.setPaymentService(new Payment() {
            @Override
            public void pay(User user, Apartment apartment) {
                System.out.println("Payment made for apartment " + apartment + " by user " + user);
            }
        });
        Apartment apartment = new Apartment();
        user.bookApartment(apartment);
        user.cancelBooking(apartment);
        Apartment apartment2 = new Apartment();
        user.bookApartment(apartment2);
        user.makePayment(apartment);
    }
}
