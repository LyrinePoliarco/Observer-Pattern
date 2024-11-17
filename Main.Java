public class Main {
    public static void main(String[] args) {
        // Create a NewsAgency (Publisher)
        NewsAgency newsAgency = new NewsAgency();

        // Create Subscribers (Observers)
        Subscriber john = new Subscriber("John");
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");

        // Subscribe users to the news agency
        newsAgency.subscribe(john);
        newsAgency.subscribe(alice);
        newsAgency.subscribe(bob);

        // News is published, and all subscribers should be notified
        newsAgency.publishNews("Breaking News: New technology breakthrough!");

        // Unsubscribe a user
        newsAgency.unsubscribe(alice);

        // Publish another piece of news
        newsAgency.publishNews("Breaking News: Major earthquake reported!");
    }
}
