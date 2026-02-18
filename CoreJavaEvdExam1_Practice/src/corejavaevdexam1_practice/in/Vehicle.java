
package corejavaevdexam1_practice.in;


public class Vehicle {
    int speed;
    double regularPrice;
    String color;

    public Vehicle() {
    }

    public Vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    double getSalePrice(){
        return regularPrice;
    }
   
}
