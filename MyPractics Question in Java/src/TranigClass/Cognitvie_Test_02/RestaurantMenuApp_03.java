package TranigClass.Cognitvie_Test_02;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantMenuApp_03 {
        public static void main(String[] args) {
            // Define the menu items and their prices
            Map<String, Double> menu = new HashMap<>();
            menu.put("Coke", 2.5);
            menu.put("Sprite", 2.0);
            menu.put("Fanta", 2.0);
            menu.put("Iced Tea", 3.0);
            menu.put("Lemonade", 2.5);

            // Display the menu to the customer
            System.out.println("Menu:");
            for (String item : menu.keySet()) {
                System.out.println(item + " - Rs" + menu.get(item));
            }

            // Take the customer's order
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the drink(s) you want to order (comma-separated): ");
            String orderInput = scanner.nextLine();
            String[] orderItems = orderInput.split(",");

            // Calculate the total amount
            double totalAmount = 0;
            for (String item : orderItems) {
                String menuItem = item.trim();
                if (menu.containsKey(menuItem)) {
                    totalAmount += menu.get(menuItem);
                } else {
                    System.out.println("Invalid item: " + menuItem);
                }
            }

            // Display the total amount to the customer
            System.out.println("Total amount: Rs" + totalAmount);

            scanner.close();

    }

}
