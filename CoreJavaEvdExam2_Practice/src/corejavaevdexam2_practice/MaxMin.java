/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corejavaevdexam2_practice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("enter number");
            myArray[i] = s.nextInt();
        }
        System.out.println("all numbers" + Arrays.toString(myArray));

        int max = myArray[0];
        int min = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
