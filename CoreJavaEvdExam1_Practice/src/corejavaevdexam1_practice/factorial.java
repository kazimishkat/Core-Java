
package corejavaevdexam1_practice;

import java.util.Scanner;


public class factorial {
    public static void main(String[] args) {
//         2.find factorial of 5
//        int factorial=1;
//        for(int i=1; i<=5; i++){
//            factorial = factorial*i;
//        }
//        System.out.println("Factorial of 5 is "+ factorial);
        
//        find factorial of any number
        Scanner s= new Scanner(System.in);
        System.out.println("enter number");
        int input=s.nextInt();
        int factorial=1;
        for(int i=1; i<=input; i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial of 5 is "+ factorial);
    }
    
}
