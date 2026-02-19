
package evdexam1Finalpractice;

import java.util.Scanner;

public class SumOFPositiveNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int input=s.nextInt();
        int sum=0;
//        for(int i=1;i<=input;i++){
//            System.out.println("enter number");
//            input=s.nextInt();
//            if(input>=0){
//                sum=sum+input;
//            }
//            else{
//                System.out.println("its a negative number");
//            }
//        }
           while(input>=0){
               sum=sum+input;
               System.out.println("enter number agian");
               input=s.nextInt(); 
           }
        System.out.println("sum of total "+sum);
    }
}
