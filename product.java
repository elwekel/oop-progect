/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author ibrahim ali khaled ibrahim ibrahim elwe;el 23010116
 */
public class product {
    int productID;
    String name;
    float price;
    public product(int productID, String name, float price) {
        this.productID = (productID > 0) ? productID : Math.abs(productID);
        this.name = name;
        this.price = Math.abs(price);
    }
 public void set_productID(int p){
 if (p>0)
     productID = p;
 else 
     productID = Math.abs(p);
 }
 public int get_productID (){
     return productID;
 }
 public void set_name(String n){
      name = n;
  }
 public String get_name (){
     return name;
 }
 public void set_price(float pr){
        price = Math.abs(pr);
   }
 public float get_price (){
        return price;
 }  
}
