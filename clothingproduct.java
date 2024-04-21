/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author ibrahim ali khaled ibrahim ibrahim elwe;el 23010116
 */
public class clothingproduct extends product {
    String size;
    String fabric;
    
     public clothingproduct(int productID, String name, float price, String size, String fabric) {
        super(productID, name, price);
        this.size = size;
        this.fabric = fabric;
    }
    
 public void set_size(String s){  
 size = s;
 }     
 public String get_size (){
     return size;
 }
 public void set_fabric(String f){  
 fabric = f;
 }     
 public String get_fabric (){
     return fabric;
 }
}
