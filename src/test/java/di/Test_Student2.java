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
        
        Student s3 = ctx.getBean("s3", Student.class);
        System.out.println(s3);
        
        Student s4 = ctx.getBean("s4", Student.class);
        System.out.println(s4);
        
        Student s5 = ctx.getBean("s5", Student.class);
        System.out.println(s5);
        
        Student s6 = ctx.getBean("s6", Student.class);
        System.out.println(s6);

    }
}
