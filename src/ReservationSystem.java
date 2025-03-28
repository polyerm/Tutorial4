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
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void makeReservation(Customer customer, Event event) {
        customers.addReservation(event);
    }
    public Event findEvent(String name) {
        for (Event event : events) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        public Customer findCustomer(String lastName){
            for (Customer customer : customers) {
                if(customer.getLastName().equals(name)){
                    return customer;
                }
            }
        }
    }
}
