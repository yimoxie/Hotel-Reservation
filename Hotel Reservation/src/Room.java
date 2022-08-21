import model.IRoom;
import model.RoomType;

public class Room implements IRoom {
    private String RoomNumber;
    private Double RoomPrice;
    private RoomType RoomType;

    public Room(String RoomNumber, Double RoomPrice, RoomType RoomType){
        this.RoomNumber = RoomNumber;
        this.RoomPrice = RoomPrice;
        this.RoomType = RoomType;
    }

    @Override
    public String getRoomNumber() {
        return RoomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return RoomPrice;
    }

    @Override
    public RoomType getRoomType() {
        return RoomType;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    public String toString(){
        return  "Your room number is: " + RoomNumber + " , Your room price is: " + RoomPrice + "Your room type is: " + RoomType;
    }
}
