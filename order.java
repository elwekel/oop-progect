/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author elwekel
 */
public class order {
     int customerId;
    int orderId;
    product[] products;
    float totalPrice;
        // coded by ibrahim ali khaled ibrahim ibrahim elwe;el 23010116

    public order(int customerId, int orderId, product[] products, float totalPrice) {
        this.customerId = (customerId > 0) ? customerId : Math.abs(customerId);
        this.orderId = (orderId > 0) ? orderId : Math.abs(orderId);
        this.products = products;
        this.totalPrice = (totalPrice > 0) ? totalPrice : Math.abs(totalPrice);
    }

    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        for (product product : products) {
            System.out.println(" - " + product.get_name() + ": " + product.get_price());
        }
        System.out.println("Total Price: " + totalPrice);
    }
    
}
