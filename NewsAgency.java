
import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsSubject {

    private String news;
    private List<Subscriber> subscribers = new ArrayList<>();

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        notifySubscribers();
    }

    @Override
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.updateNews(this);
        }
    }
}
