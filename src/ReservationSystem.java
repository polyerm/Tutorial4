import java.util.ArrayList;

public class ReservationSystem {
    private ArrayList<Event> events;
    private ArrayList<Customer> customers;

    public ReservationSystem() {
        this.events = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void addEvent(String name, double price) {
        events.add(new Event(name, price));
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addCustomer(String firstName, String lastName) {
        customers.add(new Customer(firstName, lastName));
    }

    public void makeReservation(Customer customer, Event event) {
        if (customer != null && event != null) {
            customer.addReservation(event);
        }
    }

    public Event findEvent(String name) {
        for (Event event : events) {
            if (event.getName().equalsIgnoreCase(name)) {
                return event;
            }
        }
        return null;
    }

    public Customer findCustomer(String lastName) {
        for (Customer customer : customers) {
            if (customer.getLastName().equalsIgnoreCase(lastName)) {
                return customer;
            }
        }
        return null;
    }

    public void changeEventPrice(String name, double newPrice) {
        Event event = findEvent(name);
        if (event != null) {
            event.setPrice(newPrice);
            System.out.println("Updated event price: " + name);
        } else {
            System.out.println("No event found.");
        }
    }
}

