package nestedifelse;

import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter username");
        String userName= s.nextLine();
        if(userName.equalsIgnoreCase("java")){
            System.out.println("enter pass");
            String pass= s.nextLine();
            if(pass.equals("123Ad")){
                System.out.println("welcome home");
            }
            else{
                System.out.println("incorrect pass");}
        }
        else{
            System.out.println("incorrect username");}



//         BMI CHECK
//        Scanner input = new Scanner(System.in);
//        System.out.println("input bmi");
//        float bmi = input.nextFloat();
//        if (bmi < 18.5) {
//            System.out.println("underweight");}
//            else if (bmi < 25.0) {
//                System.out.println("normal");}
//                else if (bmi < 30) {
//                    System.out.println("overweight");}
//                    else {
//                        System.out.println("obese");
//                    }
//
    }

}
