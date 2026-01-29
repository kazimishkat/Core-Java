
package q.solve.pkg1;

import java.util.Scanner;


public class QSolve1 {
    public static void main(String[] args) {
  
//        1.odd even check

//        Scanner input= new Scanner(System.in);
//        System.out.println("enter number");
//        int number=input.nextInt();
//        if(number%2==0){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }
          
//           2.mini calculator
            Scanner input=new Scanner(System.in);
            System.out.println("enter first number");
            int n1=input.nextInt();
            System.out.println("enter second number");
            int n2=input.nextInt();
            System.out.println("enter operator:+  -  /  * ");
            String operator = input.next();
  
            if(operator.equals("+")){
                System.out.println("answer: "+(n1+n2));
            }
            else if(operator.equals("-")){
                System.out.println(n1-n2);
            }
            else if(operator.equals("/")){
                System.out.println(n1/n2);
            }
            else if(operator.equals("*")){
                System.out.println("answer: "+(n1*n2));
            }
                   
    } 
}
