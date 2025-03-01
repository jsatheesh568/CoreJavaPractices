package CoreJavaPractices.src.inventoryManagement;

import CoreJavaPractices.src.inventoryManagement.exception.InventoryException;

public final class ElectronicItem implements InventoryItem {
    private final String name;
    private int stock;

    public ElectronicItem(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    @Override
    public void updateStock(int quantity) throws InventoryException {
        if (quantity < 0 && Math.abs(quantity) > stock) {
            throw new InventoryException ("Not enough stock available for " + name);
        }
        stock += quantity;
        System.out.println("Updated stock for " + name + ": " + stock);
    }

    @Override
    public int getStock() {
        return stock;
    }
}