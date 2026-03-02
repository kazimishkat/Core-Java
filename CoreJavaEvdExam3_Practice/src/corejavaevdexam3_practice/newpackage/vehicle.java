
package corejavaevdexam3_practice.newpackage;

public class vehicle {
    
    int speed;
    double regularPrice;
    String color;

    public vehicle() {
    }

    public vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    double getSalePrice(){
        return regularPrice;
    }
    
}
