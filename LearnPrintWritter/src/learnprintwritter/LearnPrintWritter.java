
package learnprintwritter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LearnPrintWritter {

   
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Admin\\Desktop\\aaa.txt");
        try {
            PrintWriter pw=new PrintWriter(file);
            pw.write("hello ");
            pw.println("badrul ");
            pw.println("haasn");
            for(int i=1;i<=100;i++){
                pw.println(i);
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnPrintWritter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner s=new Scanner(file);
            while(s.hasNext()){
                System.out.println(s.nextLine());
            }
            s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnPrintWritter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
