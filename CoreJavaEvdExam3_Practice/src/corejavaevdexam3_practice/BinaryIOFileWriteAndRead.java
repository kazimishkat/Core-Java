/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corejavaevdexam3_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryIOFileWriteAndRead {
    public static void main(String[] args) {
        try {
            FileOutputStream output=new FileOutputStream("C:\\Users\\Admin\\Desktop\\as.txt");
            for(int i=0;i<10;i++){
                output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIOFileWriteAndRead.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIOFileWriteAndRead.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input=new FileInputStream("C:\\Users\\Admin\\Desktop\\as.txt");
            int value;
            while((value=input.read()) !=-1){
                System.out.println(value+"");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIOFileWriteAndRead.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIOFileWriteAndRead.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
