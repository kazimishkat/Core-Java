
package learninheritance1;

import learninheritance1.mobile.Android;


public class LearnInheritance1 {

    
    public static void main(String[] args) {
        Android android= new Android();
        
        android.setBrowser("chrome");
        android.setOs("android");
        android.setPlayStore("yes");
        
        android.setCall("yes");
        android.setCamera("multiple camera");
        android.setGallery("google photos");
        android.setMessage("yes");
        android.setGames("free fire");
        
        System.out.println(android);
    }
    
}
