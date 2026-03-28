
public class expHandle {
    public static void main(String[] args) {
//        try {
//            int result= 10/0;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        
        int[] myArr= new int[5];
        try {
            myArr[5]=0;
        } catch (Exception e) {
            System.out.println("incorrct");
        }
        
    }
}
