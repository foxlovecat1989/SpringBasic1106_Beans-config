package di;

import com.mycompany.springbasic1106.di.Student;
import org.junit.Test;

public class Test_Student {
   @Test
    public void t1(){
        Student s = new Student(21, "Sam");
        System.out.println(s);
   } 
}
