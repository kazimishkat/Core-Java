
package pkg29.pkg1.pkg26.practice;

import java.util.Scanner;


public class Practice {

 
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your name");
        String name= input.next();
        String firstPart= name.substring(0, 1).toUpperCase();
        String middlePart= name.substring(1,name.length()-1).toLowerCase();
        String lastPart= name.substring(name.length()-1).toUpperCase();
        String newName= firstPart+middlePart+lastPart;
        System.out.println(newName);
        
        
    }
    
}
