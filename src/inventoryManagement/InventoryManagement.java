package CoreJavaPractices.src.inventoryManagement;

import CoreJavaPractices.src.inventoryManagement.exception.InventoryException;

public class InventoryManagement {
    public static void main(String[] args) {
        processInventory("ELECTRONIC", "Laptop", 10);
        processInventory("GROCERY", "Apple", 50);
        processInventory("ELECTRONIC", "Laptop", -12); // This will trigger an exception
    }

    private static void processInventory(String type, String name, int stockChange) {
        try {
            InventoryItem item = InventoryFactory.createItem(type, name, 20); // Assume initial stock = 20
            item.updateStock(stockChange);
            System.out.println("✅ Current Stock for " + name + ": " + item.getStock());
        } catch (InventoryException e) {
            System.err.println("❌ Inventory Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("⚠️ Invalid Item Type: " + e.getMessage());
        } finally {
            System.out.println("🔹 Inventory Update Completed.\n");
        }
    }
}
