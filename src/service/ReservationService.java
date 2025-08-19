package service;
import model.Reservation;
import model.Room;
import model.Customer;
import java.util.*;

public class ReservationService {
    private static final Map<String, Room> rooms = new HashMap<>();
    private static final List<Reservation> reservations = new ArrayList<>();

    public void addRoom(Room room) { rooms.put(room.getRoomNumber(), room); }
    public Room getRoom(String roomNumber) { return rooms.get(roomNumber); }
    public Collection<Room> getAllRooms() { return rooms.values(); }

    public Reservation reserveRoom(Customer customer, Room room, Date checkIn, Date checkOut) {
        for (Reservation res : reservations) {
            if (res.getRoom().equals(room) && !(checkOut.before(res.getCheckInDate()) || checkIn.after(res.getCheckOutDate()))) {
                return null; // Room is already booked for this period
            }
        }
        Reservation reservation = new Reservation(customer, room, checkIn, checkOut);
        reservations.add(reservation);
        return reservation;
    }

    public Collection<Reservation> getCustomerReservations(Customer customer) {
        List<Reservation> customerReservations = new ArrayList<>();
        for (Reservation res : reservations) {
            if (res.getCustomer().equals(customer)) {
                customerReservations.add(res);
            }
        }
        return customerReservations;
    }
}
