
package evdxm1.in;

public class vehicle {
   public int speed;
   public double regularprice;             
   public String color;

    public vehicle() {
    }

    public vehicle(int speed, double regularprice, String color) {
        this.speed = speed;
        this.regularprice = regularprice;
        this.color = color;
    }
   
    public double getSalePrice(){
        return regularprice;
    }
}
