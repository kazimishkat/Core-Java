
package midexpractice1.inheritance;

public class Truck extends vehicle{
    int weight;

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
            return regularPrice=regularPrice-(regularPrice*10/100);
        }
        else{
            return regularPrice;
        }
    }

  
   
    
    
    
}
