/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corejavaevdexam3_practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input array size");
        int input = s.nextInt();
        int[] myarr = new int[input];
        for (int i = 0; i < myarr.length; i++) {
            System.out.println("input number");
            input = s.nextInt();
            myarr[i] = input;
        }
        System.out.println("given array" + Arrays.toString(myarr));

        for (int i = 0; i < myarr.length - 1; i++) {
            for (int j = 0; j < myarr.length - 1 - i; j++) {
                if (myarr[j] > myarr[j + 1]) {
                    int temp = myarr[j];
                    myarr[j] = myarr[j + 1];
                    myarr[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array" + Arrays.toString(myarr));
    }
}
