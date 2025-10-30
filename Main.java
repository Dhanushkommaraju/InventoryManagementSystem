import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        try (Scanner sc = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("\n--- Inventory Management System ---");
                System.out.println("1. Add Item");
                System.out.println("2. Update Item");
                System.out.println("3. Delete Item");
                System.out.println("4. View All Items");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1 -> manager.addItem();
                    case 2 -> manager.updateItem();
                    case 3 -> manager.deleteItem();
                    case 4 -> manager.viewItems();
                    case 5 -> System.out.println("Goodbye!");
                    default -> System.out.println("Invalid choice!");
                }
            } while (choice != 5);

            sc.close();
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        }
    }
}

