/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author ibrahim ali khaled ibrahim ibrahim elwe;el 23010116
 */
public class Electronicproduct extends product {
    String brand;
    int warrantyperiod;
    public Electronicproduct(int productID, String name, float price, String brand, int warrantyPeriod) {
        super(productID, name, price);
        this.brand = brand;
        this.warrantyperiod = (warrantyPeriod > 0) ? warrantyPeriod : Math.abs(warrantyPeriod);
    }

 public void set_brand(String b){  
 brand = b;
 }     
 public String get_brand (){
     return brand;
 }
 public void set_warrantyperiod(int w){  
 if (w>0) 
     warrantyperiod = w;
 else 
     warrantyperiod = Math.abs(w);
 }
 public int get_warrantyperiod (){
     return warrantyperiod;
 }
     
}
