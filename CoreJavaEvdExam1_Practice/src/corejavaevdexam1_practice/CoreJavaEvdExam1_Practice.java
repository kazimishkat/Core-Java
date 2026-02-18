
package corejavaevdexam1_practice;

import java.util.Scanner;

public class CoreJavaEvdExam1_Practice {
   public static void main(String[] args) {
//     1. enter positive number ,if you give negative number program close and return sum 
//     of those positive number
       Scanner s=new Scanner(System.in);
       System.out.println("enter number");
       int input= s.nextInt();
       int sum=0;
       while(input>=0){
           sum += input;
           System.out.println("enter number");
           input=s.nextInt();
       }
       s.close();
       System.out.println("sum is "+sum);

    } 
}
