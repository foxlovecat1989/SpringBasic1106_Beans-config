package di;

import com.mycompany.springbasic1106.di.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Student2 {
    @Test
    public void t2(){
        
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
       
        Student s1 = ctx.getBean("s1", Student.class);
        System.out.println(s1);
        
        Student s2 = ctx.getBean("s2", Student.class);
        System.out.println(s2);
        
    }
}
