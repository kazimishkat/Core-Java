
package primenmbr;

import java.util.Scanner;

public class PrimeNmbr {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int number=n.nextInt();
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%1==0){
                count=count+1;
            }
        }
        
    }
    
}
