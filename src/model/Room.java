package model;
public class Room {
    private final String roomNumber;
    private final double price;
    private final RoomType roomType;

    public Room(String roomNumber, double price, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;
    }
    public String getRoomNumber() { return roomNumber; }
    public double getPrice() { return price; }
    public RoomType getRoomType() { return roomType; }
    @Override
    public String toString() { return "[" + roomType + "] - $" + price + " per night"; }
}
