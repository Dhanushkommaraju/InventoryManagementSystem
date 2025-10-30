public class InventoryItem {
    String productName;
    String sku;
    String category;
    int quantity;
    String supplier;
    double price;
    String location;

    public InventoryItem(String productName, String sku, String category, int quantity, String supplier, double price, String location) {
        this.productName = productName;
        this.sku = sku;
        this.category = category;
        this.quantity = quantity;
        this.supplier = supplier;
        this.price = price;
        this.location = location;
    }

    @Override
    public String toString() {
        return productName + " (" + sku + ") | " + category + " | Qty: " + quantity + " | ₹" + price + " | " + supplier + " | " + location;
    }
}
