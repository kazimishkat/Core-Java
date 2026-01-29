package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter factorial");
        int numuber = input.nextInt();
        int factorial = 1;
        int i = 1;

        while (i <= numuber) {
            factorial = factorial * i;

            i++;
        }
        System.out.println("factorial is " + factorial);

    }

}
