
package binary.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryIO {

    public static void main(String[] args) {
        try {
            FileOutputStream output=new FileOutputStream("C:\\Users\\Admin\\Desktop\\aaa.txt");
            for(int i=0;i<=10;i++){
                output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream intput=new FileInputStream("C:\\Users\\Admin\\Desktop\\aaa.txt");
            int value;
            while((value= intput.read()) !=-1){
                System.out.println(value+"");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    
}
