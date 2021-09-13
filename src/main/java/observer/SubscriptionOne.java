package observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubscriptionOne implements IObserver {
    private List<String> news;

    public SubscriptionOne(){
        this.news = new LinkedList<>();
    }

    @Override
    public void update(String news) {
        List<Integer> a = new ArrayList<>();
        a.add(2);
        this.news.add(news);
        System.out.print("From SubscriptionOne: ");
        for (String ne : this.news)
            System.out.print(ne + ",");
        System.out.println();
    }
}
