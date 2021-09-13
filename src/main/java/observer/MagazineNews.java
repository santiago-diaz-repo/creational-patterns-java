package observer;

import java.util.LinkedList;
import java.util.List;

public class MagazineNews {
    List<IObserver> IObservers;
    List<String> news;

    public MagazineNews(){
        this.IObservers = new LinkedList<>();
        this.news = new LinkedList<>();
    }

    public void subscribe(IObserver IObserver){
        this.IObservers.add(IObserver);
    }

    public void unsubscribe(IObserver IObserver){
        this.IObservers.remove(IObserver);
    }

    public void addNews(String news){
        this.news.add(news);
        for(IObserver observer: this.IObservers)
            observer.update(news);
    }


}
