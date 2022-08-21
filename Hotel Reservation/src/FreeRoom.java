import model.RoomType;

public class FreeRoom extends Room {
    public double price;

    public FreeRoom(String roomNumber, Double price, RoomType enumeration){
        this.price = (double)0;
    }

    public String toString(){
        return ("Room price is: " + price);
    }
}
