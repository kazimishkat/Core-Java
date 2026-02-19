
package evdexam1Finalpractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int primeNumber=0;
        for(int i=1;i<=input;i++){
            if(input%i==0){
                primeNumber=primeNumber+1;
            }
        }
        if(primeNumber==2){
            System.out.println("its prime number");
        }
        else{
            System.out.println("its not prime");
        }
    }
}
