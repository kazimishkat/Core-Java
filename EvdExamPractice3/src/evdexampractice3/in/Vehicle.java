/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evdexampractice3.in;


public class Vehicle {
    int speed;
    double regularPrice;
    String color;

    public Vehicle() {
    }

    public Vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    public double getSalePrice(){
        return regularPrice;
    }    
    
}
