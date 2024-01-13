package zadatak2;

public class MagazinesClient {

    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();
        ConcreteMagazineSubs concreteMagazineSubs = new ConcreteMagazineSubs("Ivan");
        ConcreteMagazineSubs concreteMagazineSubs1 = new ConcreteMagazineSubs("Marko");
        ConcreteMagazineSubs concreteMagazineSubs2 = new ConcreteMagazineSubs("Ivica");
        ConcreteMagazineSubs concreteMagazineSubs3 = new ConcreteMagazineSubs("Josip");
        ConcreteMagazineSubs concreteMagazineSubs4 = new ConcreteMagazineSubs("Ante");
        ConcreteMagazineSubs concreteMagazineSubs5 = new ConcreteMagazineSubs("Ivo");

        notificationService.subscribe(Magazines.JUTARNJI, concreteMagazineSubs);
        notificationService.subscribe(Magazines.JUTARNJI, concreteMagazineSubs1);

        notificationService.subscribe(Magazines.JUTARNJI, concreteMagazineSubs2);
        notificationService.subscribe(Magazines.INDEX, concreteMagazineSubs2);

        notificationService.subscribe(Magazines.INDEX, concreteMagazineSubs3);
        notificationService.subscribe(Magazines.INDEX, concreteMagazineSubs4);
        notificationService.subscribe(Magazines.INDEX, concreteMagazineSubs5);

        notificationService.notifySubs(Magazines.JUTARNJI);
        notificationService.notifySubs(Magazines.INDEX);
    }
}
