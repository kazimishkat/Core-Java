
package primenmbr;

import java.util.Scanner;

public class PrimeNmbr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int input = s.nextInt();
        int primeNumber = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                primeNumber = primeNumber + 1;
            }}
            if (primeNumber == 2) {
                System.out.println("its prime number");
            } else {
                System.out.println("its not prime number");
            }
        
    }
    
}
