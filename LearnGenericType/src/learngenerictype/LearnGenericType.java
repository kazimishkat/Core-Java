
package learngenerictype;

import java.util.ArrayList;
import learngenerictype.in.Student;

public class LearnGenericType {

    
    public static void main(String[] args) {
        ArrayList<Student> sList=new ArrayList<>();
        Student s=new Student("mishkat", 1, "mishkat@gmail.com");
        
        Student s1=new Student();
        s1.setName("sadia");
        s1.setRoll(2);
        s1.setEmail("sadia@gmail.com");
        
        sList.add(new Student("tanvir", 3, "tanvir@gmail.com"));
        sList.add(new Student("Abul", 4, "abul@gmail.com"));
        sList.add(s);
        sList.add(s1);
        
        System.out.println(sList);
       
        
        
    }
    
}
