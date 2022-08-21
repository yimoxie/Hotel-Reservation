import model.IRoom;
import model.RoomType;

public class Room implements IRoom {
    private String roomNumber;
    private Double price;
    private RoomType enumeration;

    public Room(String RoomNumber, Double price, RoomType enumeration){
        this.roomNumber = RoomNumber;
        this.price = price;
        this.enumeration = enumeration;
    }

    public Room() {
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return price;
    }

    @Override
    public RoomType getRoomType() {
        return enumeration;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    public String toString(){
        return ("Your room number is: " + roomNumber + " , Your room price is: " + price + "Your room type is: " + enumeration);
    }
}
