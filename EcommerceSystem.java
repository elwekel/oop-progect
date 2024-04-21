/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;

/**
 *
 * @author ibrahim ali khaled ibrahim ibrahim elwe;el 23010116
 */
public class EcommerceSystem  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // coded by ibrahim ali khaled ibrahim ibrahim elwe;el 23010116
          Scanner scanner = new Scanner(System.in);

        Electronicproduct electronicProduct = new Electronicproduct(1, "smartphone", 599.9f, "Samsung", 1);

        clothingproduct clothingProduct = new clothingproduct(2, "T-shirt", 19.99f, "Medium", "Cotton");

        bookproduct bookProduct = new bookproduct(3, "OOP", 39.99f, "O’Reilly", "X Publications");

        System.out.println("Enter your customer ID:");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your address:");
        String address = scanner.nextLine();
        customer customer = new customer(customerId, name, address);

        System.out.println("How many products do you want to order?");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); 
        cart cart = new cart(customerId, numProducts);
        
        for (int i = 0; i < numProducts; i++) {
                    // coded by ibrahim ali khaled ibrahim ibrahim elwe;el 23010116

            System.out.println("choose\n 1-smartphone \t 2-T-shirt \t 3-OOP  " + (i + 1) + ":");
            int productId = scanner.nextInt();
            scanner.nextLine(); 
            switch (productId) {
                case 1:
                    cart.addProduct(electronicProduct);
                    break;
                case 2:
                    cart.addProduct(clothingProduct);
                    break;
                case 3:
                    cart.addProduct(bookProduct);
                    break;
                default:
                    System.out.println("Invalid product ID.");
            }
        }
        System.out.println("your total is"+cart.calculatePrice());
        System.out.println("Do you want to place an order? (yes/no)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("here is your order's summary");
            order order = new order(customerId, 1, cart.products, (float) cart.calculatePrice());
            order.printOrderInfo();
        } else {
            System.out.println("Order not placed.");
        }
        
        scanner.close();
    }
}
    
            // coded by ibrahim ali khaled ibrahim ibrahim elwe;el 23010116


