
package bublesortbycreatingmethod;

import java.util.Arrays;

public class BubleSortByCreatingMethod {

   
    public static void main(String[] args) {
        int[] myArray={20,50,60,10,7};
        int[] output= sort(myArray);
        System.out.println(Arrays.toString(output));
        
  
    }
    public static int[] sort(int[] array){
        
    
    for(int i=0; i<array.length-1; i++){
        for(int j=0; j<array.length-1-i;j++){
            if(array[j]>array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
     }
    return array;
    }
    
    
}
