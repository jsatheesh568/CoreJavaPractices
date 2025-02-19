package CoreJavaPractices.src.hotelBooking;

import java.util.Map;

public class HotelBookingApp {
  public static void main(String[] args) {
    // Creating immutable price map using Map.of()
    Map<RoomType, Double> roomPricing =
        Map.of(
            RoomType.STANDARD, 100.0,
            RoomType.DELUXE, 200.0,
            RoomType.SUITE, 500.0);

    System.out.println("🏨 Welcome to ITC Hotels!");
    System.out.println("📌 Room Pricing: " + roomPricing);

    HotelService hotelService = new HotelService();
    hotelService.displayAvailableRooms();

    // Filtering rooms within budget
    hotelService.filterRoomsByPrice(200);

    /*
    Welcome to ITC Hotels!
📌 Room Pricing: {STANDARD=100.0, DELUXE=200.0, SUITE=500.0}

🏨 Available Rooms:
RoomType: STANDARD, Price: $100.0, Services: [WiFi, Breakfast], Amenities: [AC, TV]
RoomType: DELUXE, Price: $200.0, Services: [WiFi, Breakfast, Room Service], Amenities: [AC, TV, Minibar]
RoomType: SUITE, Price: $500.0, Services: [WiFi, Breakfast, Room Service, SPA], Amenities: [Personal Butler, TV, AC, Minibar]

🔍 Filtering rooms below $200.0:
RoomType: STANDARD, Price: $100.0, Services: [WiFi, Breakfast], Amenities: [AC, TV]
RoomType: DELUXE, Price: $200.0, Services: [WiFi, Breakfast, Room Service], Amenities: [AC, TV, Minibar]
     */
  }
}
