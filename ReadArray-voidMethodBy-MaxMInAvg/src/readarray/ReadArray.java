
package readarray;

import java.util.Arrays;
import java.util.Scanner;


public class ReadArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("input array size");
        int n=s.nextInt();
        int number[]= new int[n];
        System.out.println(Arrays.toString(number));
        for(int i=0;i<n;i++){
            System.out.println("input your "+(i+1)+"value");
            int userInput=s.nextInt();
            number[i]=userInput;
        }
        System.out.println("Your Array Value is "+Arrays.toString(number));
        findMaxNumber(number);
        findMinNumber(number);
        finAvg(number);
    }
    public static void findMaxNumber(int[] number){
        int max=0;
        for(int item : number){
            if(item>max){
                max=item;
            }
        }
        System.out.println("max number is "+max);
    }
     public static void findMinNumber(int[] number){
         int min=number[0];
         for(int item : number){
             if(item<=min){
                 min=item;
             }
         }
         System.out.println("min number is "+min);
     }
     public static void finAvg(int[] number){
         double sum=number[0];
         for(int item : number){
             sum = sum+ item;
             
         }
         double avg= sum / number.length;
         System.out.println("average number is "+avg);
     }
}
