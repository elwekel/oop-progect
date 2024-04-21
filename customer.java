/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author elwekel
 */
public class customer {
    int customerID;
    String name;
    String address;
    public customer(int customerID, String name, String address) {
        this.customerID = (customerID > 0) ? customerID : Math.abs(customerID);
        this.name = name;
        this.address = address;
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
 public void set_name(String n){  
 name = n;
 }     
 public String get_name (){
     return name;
 }
 public void set_address(String a){  
 address = a;
 }     
 public String get_address (){
     return address;
 }   

}
