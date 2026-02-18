package corejavaevdexam2_practice;

import java.util.Scanner;

public class CoreJavaEvdExam2_Practice {

    public static void main(String[] args) {
//    1.   prime number
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int input = s.nextInt();
        int primeNumber = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                primeNumber = primeNumber + 1;
            }
        }
        if (primeNumber == 2) {
            System.out.println("its prime number");
        } else {
            System.out.println("its not prime number");
        }
//        2.input number ,if you input negative number program stops and give sum all positive
//                number
//        3.find out factorial 5                

    }

}
