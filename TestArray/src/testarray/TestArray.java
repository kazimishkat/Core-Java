
package testarray;


import java.util.Arrays;


public class TestArray {

    public static void main(String[] args) {
       String studentName[]= new String[14];
       int studentAge[]=new int[14];
       
       studentName[0]="badrul";
       studentName[1]="pk";
       studentName[4]="hasan";
       
       studentAge[0]=20;
       studentAge[2]=30;
       studentAge[3]=40;
       
        System.out.println(Arrays.toString(studentName));
        System.out.println(Arrays.toString(studentAge));
    }
    
}
