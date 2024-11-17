import java.util.ArrayList;
import java.util.List;

// NewsAgency class (Publisher)
public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    // Method to subscribe a new subscriber
    public void subscribe(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println(subscriber.getName() + " has subscribed.");
        }
    }

    // Method to unsubscribe a subscriber
    public void unsubscribe(Subscriber subscriber) {
        if (subscribers.contains(subscriber)) {
            subscribers.remove(subscriber);
            System.out.println(subscriber.getName() + " has unsubscribed.");
        }
    }

    // Method to notify all subscribers
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    // Method to publish news
    public void publishNews(String news) {
        System.out.println("Publishing news: " + news);
        notifySubscribers(news);
    }
}
