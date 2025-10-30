import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManager {
    ArrayList<InventoryItem> items = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addItem() {
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter SKU: ");
        String sku = sc.nextLine();
        System.out.print("Enter Category: ");
        String category = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Supplier: ");
        String supplier = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        items.add(new InventoryItem(name, sku, category, qty, supplier, price, location));
        System.out.println("Item added successfully!");
    }

    public void viewItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        for (InventoryItem i : items) {
            System.out.println(i);
        }
    }

    public void deleteItem() {
        System.out.print("Enter SKU to delete: ");
        String sku = sc.nextLine();
        boolean removed = items.removeIf(i -> i.sku.equalsIgnoreCase(sku));
        if (removed) System.out.println("Item deleted!");
        else System.out.println("Item not found!");
    }

    public void updateItem() {
        System.out.print("Enter SKU to update: ");
        String sku = sc.nextLine();
        for (InventoryItem i : items) {
            if (i.sku.equalsIgnoreCase(sku)) {
                System.out.print("Enter new quantity: ");
                i.quantity = Integer.parseInt(sc.nextLine());
                System.out.print("Enter new price: ");
                i.price = Double.parseDouble(sc.nextLine());
                System.out.println("Item updated!");
                return;
            }
        }
        System.out.println("Item not found!");
    }
}

