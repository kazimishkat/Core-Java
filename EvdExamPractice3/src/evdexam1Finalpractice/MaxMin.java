
package evdexam1Finalpractice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        System.out.println("enter number");
//        int input=s.nextInt();
        int[] myArray=new int[5];
        for(int i=0;i<myArray.length;i++){
            System.out.println("enter number");
            myArray[i]=s.nextInt();
            
        }
        System.out.println("total "+Arrays.toString(myArray));
        int max=myArray[0];
        int min=myArray[0];
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]>max){
                max=myArray[i];
            }
            if(myArray[i]<min){
                min=myArray[i];
            }
        }
        System.out.println("max number is "+max);
        System.out.println("min number is "+min);
        
    }
}
