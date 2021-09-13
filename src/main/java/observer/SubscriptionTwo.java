package observer;

import java.util.LinkedList;
import java.util.List;

public class SubscriptionTwo implements IObserver {
    private List<String> news;

    public SubscriptionTwo(){
        this.news = new LinkedList<>();
    }

    @Override
    public void update(String news) {
        this.news.add(news);
        System.out.print("From SubscriptionTwo: ");
        for (String ne : this.news)
            System.out.print(ne + ",");
        System.out.println();
    }
}
