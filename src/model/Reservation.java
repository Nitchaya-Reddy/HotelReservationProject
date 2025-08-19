package model;
import java.util.Date;
public class Reservation {
    private final Customer customer;
    private final Room room;
    private final Date checkInDate;
    private final Date checkOutDate;

    public Reservation(Customer customer, Room room, Date checkIn, Date checkOut) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkIn;
        this.checkOutDate = checkOut;
    }
    public Customer getCustomer() { return customer; }
    public Room getRoom() { return room; }
    public Date getCheckInDate() { return checkInDate; }
    public Date getCheckOutDate() { return checkOutDate; }
    @Override
    public String toString() {
        return "Reservation: " + customer + " booked " + room + 
               " from " + checkInDate + " to " + checkOutDate;
    }
}
