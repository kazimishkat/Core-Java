/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corejavaevdexam3_practice.newpackage;

public class Truck extends vehicle{
    int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if(weight>2000){
            return  regularPrice=regularPrice-(regularPrice*10/100);
        }
        else{
            return regularPrice;
        }
    }
    
}
