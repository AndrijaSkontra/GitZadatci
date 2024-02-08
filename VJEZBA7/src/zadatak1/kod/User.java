package zadatak1.kod;

public class User {

    private Booking bookingService;
    private Payment paymentService;

    public void bookApartment(Apartment apartment) {
        bookingService.book(apartment);
    }

    public void cancelBooking(Apartment apartment) {
        bookingService.cancel(apartment);
    }

    public void makePayment(Apartment apartment) {
        paymentService.pay(this, apartment);
    }

    public void setBookingService(Booking bookingService) {
        this.bookingService = bookingService;
    }

    public void setPaymentService(Payment paymentService) {
        this.paymentService = paymentService;
    }
}