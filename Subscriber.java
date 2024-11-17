// Subscriber class (Observer)
public class Subscriber {
    private String name;

    // Constructor to initialize the name of the subscriber
    public Subscriber(String name) {
        this.name = name;
    }

    // Method to receive news updates
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }

    // Getter for the name
    public String getName() {
        return name;
    }
}
