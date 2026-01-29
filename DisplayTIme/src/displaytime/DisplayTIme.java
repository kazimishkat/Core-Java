package displaytime;

import java.util.Scanner;

public class DisplayTIme {

    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter second");
//        int seconds = input.nextInt();
//        
//        int hour = seconds/3600;
//        seconds= seconds%3600;
//        
//        int miniute = seconds/60;
//        int second = seconds %60;
//        System.out.println("hour: "+ hour+" miniute:"+ miniute+ " second:"+ second);

        Scanner input=new Scanner(System.in);
        System.out.println("enter second");
        int seconds = input.nextInt();
        int hour= seconds/3600;
        seconds= seconds%3600;
        int miniute= seconds/60;
        int second= seconds% 60;
        System.out.println("hour: "+ hour+" miniute: "+ miniute+" second: "+ second);
    } 
}
