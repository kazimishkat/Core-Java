/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelse.areaofcircle;

import java.util.Scanner;


public class IfElseAreaOfCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float radius= scanner.nextFloat();
        float areaOfCircle;
        if(radius<=0){
            System.out.println("Invalid Radius");
        }
        else{
            areaOfCircle= (float)(Math.PI* Math.pow(radius, 2));
            System.out.println("Area Of Circle is "+ areaOfCircle);
        }
        
    }
    
}
