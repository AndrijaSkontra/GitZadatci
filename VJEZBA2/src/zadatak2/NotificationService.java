package zadatak2;

import java.util.*;

public class NotificationService {

    private Map<Magazines, List<MagazineSubscriber>> subscribersByMagazineMap;

    public NotificationService() {

        subscribersByMagazineMap = new HashMap<>();
        for(Magazines magazine : Magazines.values()) {
            subscribersByMagazineMap.put(magazine, new ArrayList<>());
        }

    }

    public void subscribe(Magazines magazine, MagazineSubscriber magazineSubscriber) {
        subscribersByMagazineMap.get(magazine).add(magazineSubscriber);
    }

    public void unsubscribe(Magazines magazine, MagazineSubscriber magazineSubscriber) {

        subscribersByMagazineMap.get(magazine).remove(magazineSubscriber);
    }

    public void notifySubs(Magazines magazine) {

        subscribersByMagazineMap.get(magazine).forEach(subs -> subs.update(magazine));
    }
}
