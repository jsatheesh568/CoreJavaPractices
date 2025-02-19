package CoreJavaPractices.src.hotelBooking;

import java.util.List;
import java.util.Set;

public class HotelRoom {
    private final RoomType roomType;
    private final List <String> defaultServices;
    private final Set <String> amenities;
    private final double price;

    public HotelRoom(RoomType roomType, List<String> defaultServices, Set<String> amenities, double price) {
        this.roomType = roomType;
        this.defaultServices = defaultServices;
        this.amenities = amenities;
        this.price = price;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public List<String> getDefaultServices() {
        return defaultServices;
    }

    public Set<String> getAmenities() {
        return amenities;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "RoomType: " + roomType + ", Price: $" + price + ", Services: " + defaultServices + ", Amenities: " + amenities;
    }
}