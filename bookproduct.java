/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author ibrahim ali khaled ibrahim ibrahim elwe;el 23010116
 */
public class bookproduct extends product {
    String author;
    String publisher;
    public bookproduct(int productID, String name, float price, String author, String publisher) {
        super(productID, name, price);
        this.author = author;
        this.publisher = publisher;
    }
            // coded by ibrahim ali khaled ibrahim ibrahim elwe;el 23010116

 public void set_author(String a){  
 author = a;
 }     
 public String get_author (){
     return author;
 }
 public void set_publisher(String p){  
 publisher = p;
 }     
 public String get_publisher (){
     return publisher;
 }
}

