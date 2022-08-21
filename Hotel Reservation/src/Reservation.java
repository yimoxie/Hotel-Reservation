import model.IRoom;
import model.RoomType;

public class Reservation extends Customer implements IRoom {
    Customer customer

    public Reservation(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

    @Override
    public String getRoomNumber() {
        return null;
    }

    @Override
    public Double getRoomPrice() {
        return null;
    }

    @Override
    public RoomType getRoomType() {
        return null;
    }

    @Override
    public boolean isFree() {
        return false;
    }
}
