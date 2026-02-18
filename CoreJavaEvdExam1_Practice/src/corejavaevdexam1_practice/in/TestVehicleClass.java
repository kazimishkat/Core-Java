//a.create a super class called vehicle,the vehicle class has following fields and methods.
//        int speed,double regularPrice,string color,double getSalePrice();
//b.create a sub class of vehicle class and name it as Truck.the Truck class has the following
// fields and methods.
//        int weight;
// now override the double getSalePrice() method from its super class and apply 
// the following logic- 
//        if weight>2000,10% discount.otherwise no discount on regularprice.

package corejavaevdexam1_practice.in;

public class TestVehicleClass {
    public static void main(String[] args) {
        Truck t=new Truck(2005, 100);
        System.out.println(t.getSalePrice());
    }
    
}
