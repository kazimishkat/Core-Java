/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import java.util.Scanner;

public class JavaApplication14 {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int userInput= n.nextInt();
        System.out.println("enter a number");
        
//        using void
//        checkFactorial(userInput);

//        using return type
        int outputFactorialNumber= checkFactorial(userInput);
        System.out.println(outputFactorialNumber);
    }
    
//    public static void checkFactorial(int number){
//        int factorial=1;
//        int i=1;
//        while(i<=number){
//            factorial=factorial*i;
//            i++;
//        }
//        System.out.println(factorial);
//    }
    public static int checkFactorial(int number){
        int factorial=1;
        int i=1;
        while(i<=number){
            factorial=factorial*i;
            i++;
        }
        return factorial;
    }
}
