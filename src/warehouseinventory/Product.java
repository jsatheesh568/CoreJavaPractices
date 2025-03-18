package CoreJavaPractices.src.warehouseinventory;

public record Product(String sku, String name, int quantity, StorageType storageType) { }
