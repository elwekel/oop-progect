/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author elwekel
 */
public class cart {
   int customerID;
   int nproducts;
   product[]products;
   
   public cart(int customerId, int nProducts) {
        this.customerID = Math.abs(customerId);
        this.nproducts = Math.abs(nProducts);
        this.products = new product[this.nproducts];
    }
           // coded by ibrahim ali khaled ibrahim ibrahim elwe;el 23010116

   public void set_customerID(int c){
 if (c>0)
     customerID = c;
 else 
     customerID = Math.abs(c);
 }
 public int get_customerID (){
     return customerID;
 }
 public void set_nproducts(int n){
 if (n>0)
     nproducts = n;
 else 
     nproducts = Math.abs(n);
 }
 public int get_nproducts (){
     return nproducts;
 }
 
  public void addProduct(product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }


  public void removeProduct(product product) {
    for (int i = 0; i < products.length; i++) {
        if (products[i] == product) {
            products[i] = null;
            break;
        }
    }
}
 public double calculatePrice() {
    double totalPrice = 0.0;
    for (product product : products) {
        if (product != null) {
            totalPrice += product.get_price();
        }
    }
    return totalPrice;
}

    public void placeOrder() {
        System.out.println("Order placed successfully.");
    }
}
   

 
    

