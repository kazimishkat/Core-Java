/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BinaryIOPractice1 {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\Admin\\Desktop\\as.txt");
            for(int i=0;i<10;i++){
                output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIOPractice1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIOPractice1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\Admin\\Desktop\\as.txt");
            int value;
            while((value=input.read())!= -1){
                System.out.println(value+"");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIOPractice1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIOPractice1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
