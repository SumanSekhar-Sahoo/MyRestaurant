import java.util.HashMap;
import java.util.Scanner;

public class MyRestaurant {
    public static void main(String[] args) {
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("Pizza", 199);
        menu.put("Pasta", 59);
        menu.put("Salad", 49);
        menu.put("Burger", 79);
        menu.put("Fries", 29);
        menu.put("Coffee", 80);

        System.out.println("Welcome to MY Restaurant");
        System.out.println("-------------------------------");
        System.out.println("1. Pizza: Rs 199 \n2. Pasta: Rs 59 \n3. Salad: Rs 49 \n4. Burger: Rs 79 \n5. Fries: Rs 29 \n6. Coffee: Rs 80");

        Scanner scanner = new Scanner(System.in);
        int orderTotal = 0;

        // Ask the user to order
        System.out.print("Enter the name of the item you want to order: ");
        String item1 = scanner.nextLine();

        if (menu.containsKey(item1)) {
            orderTotal += menu.get(item1);
            System.out.println("Your item " + item1 + " has been added to your order.");
        } else {
            System.out.println("Sorry, we don't have that item in our menu.");
        }

        System.out.print("Do you want to order another item? (yes/no): ");
        String anotherOrder = scanner.nextLine();

        if (anotherOrder.equalsIgnoreCase("yes")) {
            System.out.print("Enter the name of the item you want to order: ");
            String item2 = scanner.nextLine();

            if (menu.containsKey(item2)) {
                orderTotal += menu.get(item2);
                System.out.println("Your item " + item2 + " has been added to your order.");
            } else {
                System.out.println("Sorry, we don't have that item in our menu.");
            }
        }

        System.out.println("The total cost of your order is: Rs " + orderTotal);
        System.out.println("Thank you for ordering from MY Restaurant 😊.");
        scanner.close();
    }
}
