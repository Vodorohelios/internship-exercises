package exercises02.designpatterns.singleton;

// Lazy instantiation
public class VisitorTicketTracker {
    private static VisitorTicketTracker instance;
    private VisitorTicketTracker() {
    }
    public static synchronized VisitorTicketTracker getInstance() {
        if(instance == null) {
            instance = new VisitorTicketTracker();
        }
        return instance;
    }

// Data access methods
// ...
}
