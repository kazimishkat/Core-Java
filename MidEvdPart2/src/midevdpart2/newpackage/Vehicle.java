
package midevdpart2.newpackage;
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
