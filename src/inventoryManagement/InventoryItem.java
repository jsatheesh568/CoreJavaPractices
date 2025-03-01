package CoreJavaPractices.src.inventoryManagement;

import CoreJavaPractices.src.inventoryManagement.exception.InventoryException;

public sealed interface InventoryItem permits ElectronicItem, GroceryItem {
    void updateStock(int quantity) throws InventoryException;
    int getStock();
}

