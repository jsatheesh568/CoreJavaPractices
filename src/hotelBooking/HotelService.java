package CoreJavaPractices.src.hotelBooking;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class HotelService {
    private final List <HotelRoom> availableRooms;

    public HotelService() {
        availableRooms = Arrays.asList(
                new HotelRoom(RoomType.STANDARD, Arrays.asList("WiFi", "Breakfast"), Set.of("TV", "AC"), 100),
                new HotelRoom(RoomType.DELUXE, Arrays.asList("WiFi", "Breakfast", "Room Service",HotelConstants.POOL_SERVICE), Set.of("TV", "AC", "Minibar"), 200),
                new HotelRoom(RoomType.SUITE, Arrays.asList("WiFi", "Breakfast", "Room Service", HotelConstants.SPA_SERVICE),
                        Set.of("TV", "AC", "Minibar", "Personal Butler"), 500)
        );
    }

    public void displayAvailableRooms() {
        System.out.println("\n🏨 Available Rooms:");
        availableRooms.forEach(System.out::println);
    }

    public void filterRoomsByPrice(double maxPrice) {
        System.out.println("\n🔍 Filtering rooms below $" + maxPrice + ":");
        Arrays.stream(availableRooms.toArray(new HotelRoom[0])) // Using Arrays.stream()
                .filter(room -> room.getPrice() <= maxPrice)
                .forEach(System.out::println);
    }
}
