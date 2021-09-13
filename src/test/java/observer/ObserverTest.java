package observer;

import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void testObserver(){
        MagazineNews magazineNews = new MagazineNews();
        IObserver subs1 = new SubscriptionOne();
        IObserver subs2 = new SubscriptionTwo();
        magazineNews.subscribe(subs1);
        magazineNews.subscribe(subs2);

        magazineNews.addNews("hello");
        magazineNews.addNews("world");
        magazineNews.addNews("last");

        magazineNews.unsubscribe(subs1);
        magazineNews.addNews("news");

    }
}
