
package searchingarray;

public class SearchingArray {
    public static void main(String[] args) {
     int[] myArray={9,5,7,10,20,30};
     int search=10;
     int result=linearSearch(myArray, search);
        System.out.println("your index is "+result);
    }
public static int linearSearch(int[] array,int searchNumber){
    int result= -1;
    for(int i=0;i<array.length;i++){
        if(array[i] == searchNumber){
            result=i;
        }
    }
    return result;
}
}
