

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create subscribers
        Subscriber maria = new Subscriber();
        maria.setSubscriberName("Maria");

        Subscriber juan = new Subscriber();
        juan.setSubscriberName("Juan");

        Subscriber oliver = new Subscriber();
        oliver.setSubscriberName("Oliver");

        // Add subscribers to the list
        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(maria);
        subscriberList.add(juan);
        subscriberList.add(oliver);

        // Create news agency and set the subscribers
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setNews("Breaking News: New tech innovation!");

        // Attach subscribers to the news agency
        for (Subscriber subscriber : subscriberList) {
            newsAgency.attach(subscriber);
        }

        // Publish news and notify all subscribers
        System.out.println("Updates after publishing news:");
        newsAgency.setNews("Breaking News: New stock market highs!");

        // Unsubscribe Juan and add a new subscriber Jerry
        newsAgency.detach(juan);

        Subscriber jerry = new Subscriber();
        jerry.setSubscriberName("Jerry");
        newsAgency.attach(jerry);

        // Publish another news update
        System.out.println("Updates after Juan unsubscribed and Jerry subscribed:");
        newsAgency.setNews("Breaking News: Major sports event results!");

    }
}
