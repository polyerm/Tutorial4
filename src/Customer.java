import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Event> reservationList;

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.reservationList = new ArrayList<>();
    }

    public Customer(String firstName, String lastName) {
        this(firstName, lastName, "");
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public ArrayList<Event> getReservationList() { return reservationList; }
    public void setReservationList(ArrayList<Event> reservationList) { this.reservationList = reservationList; }

    public void addReservation(Event event) {
        if (!reservationList.contains(event)) {
            reservationList.add(event);
            System.out.println("Reservation has been added to the list.");
        }
    }

    public void displayReservations() {
        if (reservationList.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            for (Event event : reservationList) {
                System.out.println(event);
            }
        }
    }

    public void cancelReservation(Event event) {
        reservationList.remove(event);
    }
}
