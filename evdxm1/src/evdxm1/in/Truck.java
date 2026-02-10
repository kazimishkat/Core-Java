
package evdxm1.in;

public class Truck extends vehicle{
    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if(weight>2000){
            return super.regularprice - (super.regularprice * .10);
        }
        else{
            return super.regularprice;
        }
    }
    
    
    
}
