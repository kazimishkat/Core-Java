
package guessgame;

import java.util.Scanner;

public class GuessGame {

 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int randomNum= (int)(Math.random()*10);
        int chance=3;
        boolean win=false;
        while(chance>=1){
            System.out.println("enter guess number(" + chance + " chance left):");
            int guessNum= s.nextInt();
            if(guessNum==randomNum){
                System.out.println("you win");
                win=true;
                break;
            }
            else if(guessNum>randomNum){
                System.out.println("your number is large");
            }
//            else if(guessNum<randomNum){
//                System.out.println("your number is small");}
            else{System.out.println("your guess is small");}
            chance--;
            }
        if(!win){
            System.out.println("better luck next time");
        }
        System.out.println("the guess number is "+randomNum);
        }
        
    }
    

