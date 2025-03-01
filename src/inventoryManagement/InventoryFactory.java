package CoreJavaPractices.src.inventoryManagement;

public class InventoryFactory {
    public static InventoryItem createItem(String type, String name, int stock) {
        return switch (type.toUpperCase()) {  // Java 17 switch expressions
            case "ELECTRONIC" -> new ElectronicItem(name, stock);
            case "GROCERY" -> new GroceryItem(name, stock);
            default -> throw new IllegalArgumentException("Invalid inventory type: " + type);
        };
    }
}
